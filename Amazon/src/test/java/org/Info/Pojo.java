package org.Info;

public class Pojo {

	public static AndroidDriver<WebElement> driver;
	
	public Pojo() {
		PageFactory.initElements(new AppiumFileDecorator(driver), this);
		
	}
	@AndroidFindBy(xpath="//*resource id='in.amazon.mshop.android.shopping:id/sso_email']")
	private webElement email;
	@AndroidFindBy(xpath="//*resource id='in.amazon.mshop.android.shopping:id/sso_pass']")
	private webElement pass;
	public static AndroidDriver<WebElement> getDriver() {
		return driver;
	}
	public webElement getEmail() {
		return email;
	}
	public webElement getPass() {
		return pass;
	}
	public webElement getBtnclick() {
		return btnclick;
	}
		
	
	
}
