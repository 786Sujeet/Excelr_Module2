package com.sujeet.Exelar_Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3_Module2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		  WebElement from=driver.findElement(By.xpath("(//div[@id='draggable'])"));
		  WebElement to=driver.findElement(By.xpath("(//div[@id='droppable'])"));
		  Thread.sleep(3000); 
		  Actions action=new Actions(driver);
		  action.dragAndDrop(from, to).build().perform();
		 driver.switchTo().defaultContent();
		

	}

}
