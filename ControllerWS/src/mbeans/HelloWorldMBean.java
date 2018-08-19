package mbeans;

public interface HelloWorldMBean {
	public void setGreeting(int greeting);

	public int getGreeting();

	public void printGreeting();

}
