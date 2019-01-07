package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.ArrtureHomePage;

public class PageObjectManager {
	private ArrtureHomePage arrtureHomePage;
	private WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		 
		this.driver = driver;
 
	}
	
	public ArrtureHomePage getArrtureHomePage(){
		return (arrtureHomePage == null) ? arrtureHomePage = new ArrtureHomePage(driver) : arrtureHomePage;
		
	}
}
