package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.RishiherbalPage;

public class RishiherbalTest {
	
	public class FBForgotpassTest { 
		  WebDriver driver; 
		  @BeforeTest 
		  public void setup() 
		  { 
		   driver=new ChromeDriver(); 
		   driver.get("https://rishiherbalindia.linker.store/"); 
		 
		 
		  } 
		  @Test 
		  public void test() 
		  { 
		   RishiherbalPage ob=new RishiherbalPage(driver); 
		   ob.healthClick(); 
		   ob.instockCheck(); 
		   ob.sortbySelect(); 
		   ob.productSelect(); 
		   ob.wishlistClick(); 
		  } 
		    
		  } 
		}


