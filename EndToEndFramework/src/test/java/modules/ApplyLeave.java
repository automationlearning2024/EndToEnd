package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.BaseClass;

public class ApplyLeave extends BaseClass {
	
//	WebDriver driver;  // driver have life
//	
	ApplyLeave() throws IOException
	{
		// Constructor is first method that will get exeuted before running anything in class
		BaseClass bc = new BaseClass();
	     bc.login();
			
	}
	
	
	
	
	
	@Test
	public void applyLeaveStudent()
	{
		//driver.f////button[@title='Apply Leave']
		
		driver.findElement(By.xpath("//button[@title='Apply Leaves']")).click();
		
	}

}
