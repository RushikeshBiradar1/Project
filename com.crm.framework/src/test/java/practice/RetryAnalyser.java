package practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer  {

	
	int count=0;
	int retrylimit=3;
	public boolean retry(ITestResult result) {
		if(count<retrylimit)
		{
			count++;
			return false;
		}
		return false;
		
	}
	
 

}