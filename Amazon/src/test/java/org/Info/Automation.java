package org.Info;

public class Automation extends BaseClass{

			static AndroidDriver<WebElement> driver;
			public static void main(String[] args) {
	AppLaunch();
				URL u= new URL("http://0.0.0.0:4723");
				Pojo p = new pojo();
				fill.(p.getEmail(),"nkr@gmail.com");
				fill.(p.getPass(),"njli89");
				keyEvent k= new keyEvent(Androidkey.Enter);
				btnclick.click();
				
			
				
	}
}
