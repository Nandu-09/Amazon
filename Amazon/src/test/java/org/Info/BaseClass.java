package org.Info;

import java.awt.Dimension;
import java.time.Duration;

public class BaseClass {
	public static AndroidDriver<MobileElement>driver;
	public static void AppLaunch() {
		// TODO Auto-generated method stub
DesiredCapalities cp = new DesiredCapalites();
cp.setCapability("deviceName","oneplus6 ");
cp.setCapability("platformName","Android ");
cp.setCapability("platformVersion","10 ");
cp.setCapability("appPackage","in.amazon.mshop.android.shopping");
cp.setCapability("appActivity","com.amazon.mshop.home.HomeActivity");

driver= new AndroidDriver<MobilElement>(new URL("Http://0.0.0.0:4723/wd/hub,cp);

public static void fill(WebElement e, String s) {
e.sendKeys(s);	
}

public static void btnclick(WebElement e) {
	e.click();
	public static void scrollDown() {
	Dimension size=	driver.manage().window().getSize();
		Double s= size.getHeight()* 0.5;
		Double e= size.getHeight()* 0.2;
		int start =s.intValue();
		int end= s.intValue();
		
		TouchActions acc= new TouchPoint(driver);
		acc.press(pointOption.point(0,start)).WaitAction(Waitoptions.waitOptions(Duration.ofMinutes(start)f))
		.moveTo(Point Option.point(0,end)).release().perform().
	}
}
	}
}
