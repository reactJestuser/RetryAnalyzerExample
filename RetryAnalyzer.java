package retry.failed.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 3;

    @Override
    public boolean retry(ITestResult result) {

        if (counter < retryLimit) {
            System.out.println("Retrying test: " + result.getName());
            counter++;
            return true;
        }

        return false;
    }
}
