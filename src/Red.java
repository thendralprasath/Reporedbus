import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("changes...............");
		System.out.println("changes...............");
		System.out.println("changes...............");
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\chromee\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.redbus.in/" );
	     // WebElement txtuser= driver.findElement(By.id("twotabsearchtextbox"));
	      //txtuser.sendKeys("iphone");
	      WebElement sign= driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
	      sign.click();
	      WebElement btn= driver.findElement(By.id("signInLink"));
	      btn.click();
	      WebElement no= driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	      Thread.sleep(2000);
;	      no.sendKeys("9963604149");
	      WebElement robo= driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[3]"));
	      robo.click();
	      WebElement otp= driver.findElement(By.xpath("(//span[@class='f-w-b'])[3]"));
	      otp.click();
	      System.out.println("changes...............");
			System.out.println("changes...............");
			System.out.println("changes...............")
	}
	
}
