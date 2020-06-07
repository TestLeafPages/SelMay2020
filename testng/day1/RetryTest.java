package testng.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	int maxRun = 3;
	int count = 0;

	public boolean retry(ITestResult result) {

		if (!result.isSuccess() && count < maxRun) {
			count++;
			return true;
		}

		return false;
	}

	

}
