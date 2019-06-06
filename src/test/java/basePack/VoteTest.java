package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VoteTest {

    WebDriver driver;

    public VoteTest(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void voteforBaby(){
    	System.out.println("hi");
    }
    
    @AfterTest
    public void close() {
    	driver.close();
    }
}
