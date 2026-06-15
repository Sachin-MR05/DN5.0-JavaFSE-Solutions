package com.Decorator;

public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier notifier) {
		super(notifier);
	}
	private void slackNotifier() {
		System.out.print(" And SlackNotifierDecorator");
	}
	@Override
	public void send() {
		super.send();
		slackNotifier();
	}


}
