package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	//public static void main(String args[]) throws Exception{
		@Test
		public void tc002()throws Exception {
	     DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
	   
		obj.exitFrame();
		obj.logout();
		obj.CloseApplication();
		
		
		
	}

}
