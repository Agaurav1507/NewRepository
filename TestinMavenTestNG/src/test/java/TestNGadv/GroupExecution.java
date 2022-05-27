package TestNGadv;

import org.testng.annotations.Test;

public class GroupExecution {
	@Test(groups = "regression")
	public void testCaseOne() {
		System.out.println("Im in testCaseOne - And in Regression Group");
	}

	@Test(groups = "regression")
	public void testCaseTwo() {
		System.out.println("Im in testCaseTwo - And in Regression Group");
	}

	@Test(groups = "smoke test")
	public void testCaseThree() {
		System.out.println("Im in testCaseThree - And in smoke test Group");
	}

	@Test(groups = "regression")
	public void testCaseFour() {
		System.out.println("Im in testCaseFour - And in Regression Group");
	}

	@Test(groups = "smoke test")
	public void testCaseFive() {
		System.out.println("Im in testCaseThreeFive - And in smoke test Group");
	}
}