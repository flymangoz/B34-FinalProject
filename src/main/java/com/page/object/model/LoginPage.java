package com.page.object.model;

import org.openqa.selenium.By;

public class LoginPage {

	public static By userName = By.xpath("//*[@id='username']"); 
	public static By passWord = By.xpath("//*[@id='password']");
	public static By logIn = By.xpath("//*[@type='submit']");
	public static By logOut = By.xpath("//*[text()='Logout']");
	
	
}
