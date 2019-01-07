package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArrtureHomePage {

	 WebDriver driver;

	public ArrtureHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
