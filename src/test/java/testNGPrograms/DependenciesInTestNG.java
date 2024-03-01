package testNGPrograms;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependenciesInTestNG {
	static String trackingNumber = null;

    @Ignore
	@Test(priority = 2)
	public void createShipment() {
//		System.out.println(5/0);
		System.out.println("Create shipment");
		trackingNumber = "ABC123YH";
	}
	@Test(priority = 1,dependsOnMethods = {"createShipment"},ignoreMissingDependencies = true)//,alwaysRun = true
	public void trackShipment() throws Exception {
		if (trackingNumber != null)
			System.out.println("Track Shipment");
		else
			throw new Exception("Incorrect tracking number:trackShipment");
	}

	@Test(priority=3,dependsOnMethods = {"createShipment","trackShipment"})
	public void cancelShipment() throws Exception {
		if (trackingNumber != null)
			System.out.println("Cancel Shipment");
		else
			throw new Exception("Incorrect tracking number:cancelShipment");
	}
}
