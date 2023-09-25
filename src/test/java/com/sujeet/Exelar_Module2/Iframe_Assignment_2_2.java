package com.sujeet.Exelar_Module2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Assignment_2_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement ele=driver.findElement(By.linkText("Click Here"));
		ele.click();
		Thread.sleep(3000);
		
		Set<String> windowId = driver.getWindowHandles();

        Iterator<String> it = windowId.iterator();

        String parentWindowId = it.next();

        System.out.println("parentWindowId : "+parentWindowId);

        String childWindowId = it.next();

        System.out.println("childWindowId : "+childWindowId);

        

        //Switching From Parent Browser To Child Browser.

        driver.switchTo().window(childWindowId);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
		email.sendKeys("abc@gmail");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.name("btnLogin"));
		submit.click();
		
		Thread.sleep(2000);
		//Switching From Child Browser To Parent Browser.

        driver.switchTo().window(parentWindowId);
		
		
		

	}

}
