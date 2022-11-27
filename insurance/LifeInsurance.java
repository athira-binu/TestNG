package insurance;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class LifeInsurance {
	@BeforeGroups("SMK")
	public void BeforeGroups() {
		System.out.println("Before Groups");
	}
	@AfterGroups("SMK")
	public void AfterGroups() {
		System.out.println("After Groups");
	}
	@Test(groups= {"SMK"},enabled=false)
	public void MobileLoginForLife() {
		System.out.println("Life Insurance Mobile Login");
	}
	@Test
	public void MobileLogoutForLife() {
		System.out.println("Life Insurance Mobile Logout");
	}
	@Test(groups= {"SMK"},enabled=true)
	public void WebLoginForLife() {
		System.out.println("Life Insurance Web Login");
	}
	@Test(dependsOnMethods= {"WebLoginForLife"})
	public void WebLogoutForLife() {
		System.out.println("Life Insurance Web Logout");
	}

}
