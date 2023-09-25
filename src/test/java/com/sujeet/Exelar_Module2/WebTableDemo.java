package com.sujeet.Exelar_Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		Thread.sleep(3000);
		List<WebElement>tableRow=driver.findElements(By.xpath("//table[@name='BookTable']/child::tbody[1]/child::tr"));
		System.out.println("Table Row is:"+tableRow.size());
		List<WebElement>tableColumns=driver.findElements(By.xpath("//table[@name='BookTable']/child::tbody[1]/child::tr[1]/child::th"));
		System.out.println("Table Columns are:"+tableColumns.size());
		
		for(int r=2;r<=tableRow.size();r++)
		{
			for(int c=1;c<=tableColumns.size();c++)
			{
				String tableData=driver.findElement(By.xpath("//table[@name='BookTable']/child::tbody[1]/child::tr["+ r  +"]/child::td["+ c  +"]")).getText(); 
				  System.out.print(tableData + " | "); 
			}
			String tableData=driver.findElement(By.xpath("//table[@name='BookTable']/child::tbody[1]/child::tr[2]/child::td[1]")).getText(); 
			  
			  System.out.println(); 
			  
		}
		
	}

}
