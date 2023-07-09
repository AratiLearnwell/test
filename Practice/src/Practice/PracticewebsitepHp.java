package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticewebsitepHp 
{

	public static void main(String[] args) throws InterruptedException
	{
		
    System.setProperty("Webdriver.chromedriver", "E:\\Learnwell Assignments\\chromedriver_win32\\chromedriver.exe")	;
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/menu");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
    driver.findElement(By.xpath("////li[@id='item-7']")).click();
    //driver.findElement(By.xpath("//a[@href='https://phptravels.com/integrations']")).click();
    
	}

}
