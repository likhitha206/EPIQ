package Epic.library;

import org.openqa.selenium.By;

import utils.AppUtiles;

public class EpicLoginPage extends AppUtiles {
	
public void login(String cpl,String uid,String pwd) {
		

		driver.findElement(By.id("company")).sendKeys(cpl);
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("proceed")).click();
		driver.findElement(By.id("btnYes")).click();
		driver.findElement(By.id("selectPlant_238")).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div/button")).click();

}
       /* public void logout()
{
	
	         driver.findElement(By.xpath("/html/body/nav/div/ul[2]/li[3]/a/i")).click();
	//driver.findElement(By.linkText("Logout")).click();
}
*/
    /*     public boolean isDMSModuleDisplayed()
        {
	     if(driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/a")).isDisplayed())
	     {
	    	 return true;
	     }else
	    	 return false;
        }*/
}
