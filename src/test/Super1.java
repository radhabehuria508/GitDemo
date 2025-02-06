package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Super1 {
	@BeforeTest
	public void login() {
		System.out.println("login");
	}
	@AfterTest
	public void logout() {
		System.out.println("logout");
	}

}
