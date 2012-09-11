package com.raj.tracer.rule;

import java.util.Observable;


public class PrintStackTraceAction implements Action {

	private String message;
	
	public PrintStackTraceAction () {
		message = "";
	}
	public void execute(RuleSession input) {
		System.out.println(message + "RULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(message + "RULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL (other execute can be deleted");
	}
}
