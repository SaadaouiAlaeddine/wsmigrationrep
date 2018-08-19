package initialization;

import java.lang.management.ManagementFactory;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.monitor.GaugeMonitor;
import javax.servlet.http.HttpServlet;
import initialization.GaugeMonitorListener;
import logic.ControllerClass;

@SuppressWarnings("serial")
public class InitServlet extends HttpServlet {

	private GaugeMonitor monitor = null;
	MBeanServer mbs = null;
	ObjectName monitorName = null;
	ObjectName resourceName = null;

	@Override
	public void init() {
		// load properties from disk, do be used by subsequent doGet() calls

		try {
			String wsdl="http://127.0.0.1:8080/ComputationWS/services/ComputationClassPort?wsdl";
			if(!ControllerClass.endpointList.contains(wsdl))
			{
			 ControllerClass.endpointList.add(wsdl);
			}
			mbs = ManagementFactory.getPlatformMBeanServer();
			monitor = new GaugeMonitor();
			String domain = mbs.getDefaultDomain();
			monitorName = new ObjectName(domain + ":name=" + "javax.management.monitor.GaugeMonitor");
			resourceName = new ObjectName("Catalina:type=ThreadPool,name=\"http-nio-8080\"");
			//HelloWorld hw = new HelloWorld();
			//mbs.registerMBean(hw, resourceName);
			monitor.addObservedObject(resourceName);
			monitor.setObservedAttribute("currentThreadsBusy");
			monitor.setGranularityPeriod(2 * 1000);
			((GaugeMonitor) monitor).setNotifyHigh(true);
			((GaugeMonitor) monitor).setNotifyLow(true);
			((GaugeMonitor) monitor).setThresholds(new Integer(6), new Integer(1));

			mbs.registerMBean(monitor, monitorName);
			mbs.addNotificationListener(monitorName, new GaugeMonitorListener(), null, null);
			monitor.start();
		}catch(

	MalformedObjectNameException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	InstanceAlreadyExistsException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	MBeanRegistrationException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	NotCompliantMBeanException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	InstanceNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} /*
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

	public void destroy() {
		if (mbs != null) {
			monitor.stop();
			try {
				mbs.unregisterMBean(resourceName);
				mbs.unregisterMBean(monitorName);
			} catch (MBeanRegistrationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstanceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}