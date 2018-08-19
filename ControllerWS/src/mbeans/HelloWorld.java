package mbeans;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class HelloWorld extends NotificationBroadcasterSupport implements HelloWorldMBean {
	// greetig is a manageable resource
	private int greeting;

	public HelloWorld() {

		this.greeting = 0;
	}

	public HelloWorld(int greeting) {
		this.greeting = greeting;
	}

	public void setGreeting(int greeting) {
		this.greeting = greeting;
		// create notification object and send it
		Notification notification = new Notification("logic.HelloWorld.test", this, -1, System.currentTimeMillis(),
				"Greeting Notification");
		sendNotification(notification);
	}

	public int getGreeting() {
		return greeting;
	}

	public void printGreeting() {
		System.out.println(greeting);
	}

}
