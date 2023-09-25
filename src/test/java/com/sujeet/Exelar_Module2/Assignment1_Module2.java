package com.sujeet.Exelar_Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*Assignment -1(WebTable):
➤ url : https://demo.guru99.com/test/web-table-element.php
 ➤ Retrieve the all company names from the table
➤ And display in console
➤ url : https://demo.guru99.com/test/login.html
➤ Enter email
➤ Enter password
➤ Click on Login button*/

public class Assignment1_Module2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("a.sujeet786@gmail.com");
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys("Parewa@83");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		

	}

}
