package testfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

import appfeatures.AppLogin;

public class TestLogin {
	
	AppLogin ap = new AppLogin();
	
	@Test
	public void test1() {
		boolean status = ap.login("test", "test");
		Assert.assertEquals(status, true);
	}
	
	
	@Test
	public void test2() {
		boolean status = ap.login("test1", "test2");
		Assert.assertEquals(status, false);
	}

}
