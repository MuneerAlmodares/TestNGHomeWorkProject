package homeWorkTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class Amazonpage {
	
	public void AmazonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
//	@FindBy () 
//	public WebElement department
	@FindBy(name = "items")
	public WebElement item;

}
