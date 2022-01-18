package com.ezen.ac.controller;

import com.ezen.ac.controller.action.Action;
import com.ezen.ac.controller.action.IndexAction;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory itc = new ActionFactory();
	public static ActionFactory getInstance() {return itc;}
	
	public Action getAction(String command) {
		Action ac = null;
		
		if(command.equals("index")) 			ac = new IndexAction();
		
		return ac;
	}
}
