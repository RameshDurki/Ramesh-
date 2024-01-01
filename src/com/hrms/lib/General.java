package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
public void openApplication() {
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");//console
		Reporter.log("Application opened");//html repot
		Log.info("Application opened");//Logfile
	}
	
	public void login() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Log.info("Login completed");
	}
	
	public void enterFrame() throws Exception {
		Thread.sleep(3000);
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
	}
	
	public void addNewEmp() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		Thread.sleep(3000);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp added"); 
		Log.info("New emp Added");
	
	
	}
	public void exitFrame()  {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
	}
	public void logout() {
		driver.findElement(By.linkText(Link_logout)).click();
		System.out.println("Logout  completed");
		Log.info("Logout completed");
		
	}
	public void CloseApplication() throws Exception {
		driver.quit();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	

}
