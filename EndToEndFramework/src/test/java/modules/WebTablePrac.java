package modules;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePrac {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	List<WebElement> companyNames=	driver.findElements(By.xpath("//table[@id='customers'] //tr/td[1]"));
	
	for(int i=0;i<companyNames.size();i++)
	{
		
		String textValue=companyNames.get(i).getText();
		System.out.println(textValue);
		
		if(textValue.equalsIgnoreCase("Ernst Handel"))
		{
			
			WebElement matchedCompany=  companyNames.get(i);
			String text=matchedCompany.findElement(By.xpath("//following-sibling::td[2]")).getText();
			String text1=matchedCompany.findElement(By.xpath("//following-sibling::td[3]")).getText();
			System.out.println(text);
			System.out.println(text1);
			break;
			
		}
		
		
	}

	}

}
