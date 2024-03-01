package testNGPrograms;
import org.testng.annotations.Test;
public class FlightBookingTest {
	@Test(priority=1)
	public void Signup() {
		System.out.println("Signup");
	}
	@Test(priority=2)
	public void Login() {
		System.out.println("Login");
	}
	@Test(priority=3)
	public void SearchTheFlight() {
		System.out.println("Search The Flight");
	}
	@Test(priority=4)
	public void BookTheFlight() {
		System.out.println("Book The Flight");
	}
	@Test(priority=5)
	public void SaveTheFlight() {
		System.out.println("Save The Flight");
	}	
	@Test(priority=6)
	public void SignOut() {
		System.out.println("Sign Out");
	}
}
