package logic;

import javax.jws.WebService;

import dataStructure.CircularList;
import initialization.GaugeMonitorListener;

@WebService(targetNamespace = "http://logic/", endpointInterface = "logic.ControllerWSSEI", portName = "ControllerClassPort", serviceName = "ControllerClassService")
public class ControllerClass implements ControllerWSSEI {
	public static CircularList<String> endpointList=new CircularList<String>();
	public boolean start(String webContext) {
		return true;
	}

	public boolean stop(String webContext) {
		return true;
	}
	public String getNextEndpoint()
	{
		String x=null;
		//return endpointList.getNext();
		while (x==null)
		{
			x=endpointList.getNext();
			if(!GaugeMonitorListener.exist(x))
				x=null;
		}
		return x;
	}

}
