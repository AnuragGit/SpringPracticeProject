package com.java.dependencyinjection.injector;

import com.java.dependencyinjection.consumer.Consumer;
import com.java.dependencyinjection.consumer.MyDIApplication;
import com.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
