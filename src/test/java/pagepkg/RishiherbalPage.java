package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RishiherbalPage {
	
	WebDriver driver; 
	@FindBy(xpath="//div[@id='menu']/ul/li[2]/a") 
	WebElement health; 
	@FindBy(xpath="//*[@id=\"outOfStockFilter\"]") 
	WebElement instock; 
	@FindBy(xpath="//*[@id=\"input-sort\"]") 
	WebElement sortby; 
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a") 
	WebElement product; 
	@FindBy(xpath="//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span") 
	WebElement wishlist; 
	public RishiherbalPage(WebDriver driver) 
	{ 
	
	this.driver=driver; 
	PageFactory.initElements(driver, this); 
	}
	public void healthClick() 
	{ 
	health.click(); 
	 } 
	 public void instockCheck() 
	 { 
	  instock.click(); 
	 } 
	 public void sortbySelect() 
	 { 
	   
	  Select filter=new Select(sortby); 
	  filter.selectByValue("alphabet-desc"); 
	 } 
	 public void productSelect() 
	 { 
	  product.click(); 
	 } 
	 public void wishlistClick() 
	 { 
	  wishlist.click(); 
	 } 
	}


