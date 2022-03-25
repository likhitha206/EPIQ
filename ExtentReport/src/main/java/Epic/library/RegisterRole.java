package Epic.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtiles;

public class RegisterRole extends AppUtiles {
	
	
	public void role(String level, String Role)  {
		
		//DMS
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[4]/a")).click();

		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[4]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.id("DMS_System Manager_Admin & Security_MENU0152_MENU0069")).click();
		
		//iframe
				driver.switchTo().frame(driver.findElement(By.id("bodyFrame")));
				
				driver.findElement(By.id("RoleRegistration_RoleRegistrationCode")).sendKeys(level);
				driver.findElement(By.id("RoleRegistration_RoleRegistrationDesc")).sendKeys(Role);
				
				Select category =new Select(driver.findElement(By.id("RoleRegistration_CategoryId")));
				category.selectByVisibleText("Technical");
				
				
}
}