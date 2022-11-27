package insurance;

import org.testng.annotations.Test;

public class VehicleInsurance {
	@Test(enabled=true,priority=1)
	public void MobileLoginForVehicle() {
		System.out.println("Vehicle Insurance Mobile Login");
	}
	@Test(enabled=false,priority=2)
	public void MobileLogoutForVehicle() {
		System.out.println("Vehicle Insurance Mobile Logout");
	}
	@Test(enabled=true,priority=3)
	public void WebLoginForVehicle() {
		System.out.println("Vehicle Insurance Web Login");
	}
	@Test(dependsOnMethods= {"WebLoginForVehicle"})
	public void WebLogoutForVehicle() {
		System.out.println("Vehicle Insurance Web Logout");
	}

}
