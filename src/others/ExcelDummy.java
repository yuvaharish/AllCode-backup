package others;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcelDummy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement popUp = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		popUp.click();
		WebElement menuLink = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span"));
		WebElement watchName = driver
				.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/ul/li/ul/li[4]/ul/li[5]/a"));
		Actions acc = new Actions(driver);
		acc.moveToElement(menuLink).perform();
		watchName.click();
		WebElement pageNext = driver.findElement(
				By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[12]/div/div/nav/a[11]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pageNext);
		List<WebElement> page = driver.findElements(By.xpath("//a[contains(@href,'Fossil&page')]"));
		Scanner sc = new Scanner(System.in);
		System.out.println("PageNumber morethan 10 Please Enter Next");
		String next = sc.next();
		for (int i = 0; i < page.size(); i++) {
			String PageNumber = page.get(i).getText();
			System.out.println(PageNumber);
			if (PageNumber.equalsIgnoreCase(next)) {
				System.out.println("You Clicked Page Number :"+PageNumber);
				WebElement page3 = driver.findElement(By.linkText(PageNumber));
				js.executeScript("arguments[0].click();", page3);
			}
		}
		driver.navigate().refresh();
		List<WebElement> productName = driver
				.findElements(By.xpath("//*[contains(@class,'_1vC4OE')]"));
		List<WebElement>  productprice = driver
				.findElements(By.xpath("//*[contains(@class,'_2mylT6')]"));
		Map<String, String> ma = new LinkedHashMap<>();
		for (int i = 0; i < productprice.size(); i++) {
			String Price = productprice.get(i).getText();
			String Name = productName.get(i).getText();
			ma.put(Price, Name);	
		}
		Set<Entry<String, String>> entrySet = ma.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("product name :"+entry.getKey()+"Product price :"+entry.getValue().replaceAll("[^0-9,]", "INR "));
		}
		WebElement findElement = driver.findElement(By.xpath("(//*[@class='_2mylT6'])[3]"));
		findElement.click();
		System.out.println("Watch Selected");
	}
}
