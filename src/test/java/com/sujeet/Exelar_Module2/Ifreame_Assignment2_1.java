package com.sujeet.Exelar_Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifreame_Assignment2_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
	Thread.sleep(2000);

	    driver.switchTo().defaultContent();
	}

}
