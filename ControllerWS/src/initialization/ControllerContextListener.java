package initialization;




import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ControllerContextListener implements ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	// Run this before web application is started
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		/*String fileName = "./resources/config.txt";
		ControllerContextListener context = new ControllerContextListener();
		ClassLoader classLoader = context.getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		System.out.println(file.getAbsolutePath());
		String content = "test"+ControllerClass.endpointList.getNext();
		BufferedWriter out = null;
		try {
			FileWriter fstream = new FileWriter(file, true);
			out = new BufferedWriter(fstream);
			out.write(content);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
	}


}
