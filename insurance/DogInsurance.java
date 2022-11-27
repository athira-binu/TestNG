package insurance;

import org.testng.annotations.Test;

public class DogInsurance {
	@Test(priority=1)
	public void MobileLoginForD() {
		System.out.println("Dog Insurance Mobile Login");
		//Assert.assertEquals()
	}
	@Test(priority=2)
	public void MobileLogoutForD() {
		System.out.println("Dog Insurance Mobile Logout");
	}
	@Test(priority=3)
	public void WebLoginForD() {
		System.out.println("Dog Insurance Web Login");
	}
	@Test(priority=4)
	public void WebLogoutForD() {
		System.out.println("Dog Insurance Web Logout");
	}

}
