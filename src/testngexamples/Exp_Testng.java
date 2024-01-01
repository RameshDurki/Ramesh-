package testngexamples;

import org.testng.annotations.Test;

public class Exp_Testng {
	@Test//one@Test is eual to one Testcase/scenario in htmlreport
	public void login() {
		System.out.println("login completed");
	}
	@Test
	public void logout() {
		System.out.println("logoutcompleted");
		
}

}
