package com.sujeet.Exelar_Module2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_module2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement custId=driver.findElement(By.name("cusid"));
		custId.sendKeys("12345");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		alert.accept();
		
		
		

	}

}
