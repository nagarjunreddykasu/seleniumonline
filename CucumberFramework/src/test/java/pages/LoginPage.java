package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="TxtEmail")
	public WebElement username;
	
	@FindBy(id="TxtPassword")
	public WebElement password;
	
	@FindBy(id="BtnLogin")
	public WebElement btnLogin;
	
	@FindBy(xpath="//*[@id='Div1']/div[2]/div")
	public WebElement errorUserName;
	
	@FindBy(xpath="//*[@id='Div1']/div[4]/div")
	public WebElement errorPassword;
	
	@FindBy(id="divemail")
	public WebElement errorUserPassword;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

}
