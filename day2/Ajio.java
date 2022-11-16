package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);	
		//to print the count of items to be bound
		String text = driver.findElement(By.className("length")).getText();
		System.out.println(text);
		//get the list of the bag names and print
		System.out.println("list of brand names");
		List<WebElement> bagbrandlist = driver.findElements(By.className("brand"));
		System.out.println("size:"+bagbrandlist.size());
		for (WebElement webElement : bagbrandlist) {
			String text2 = webElement.getText();
			System.out.println(text2);
			//get the list of names and print it
		
			List<WebElement> bagnamelist = driver.findElements(By.className("name"));
			System.out.println("size:"+bagnamelist.size());
			for (WebElement web : bagnamelist)
			{
			 String text3 = web.getText();
			 System.out.println(text3);
		}
		
		
		
		
	}

	}
}
