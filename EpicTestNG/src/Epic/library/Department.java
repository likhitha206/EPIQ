package Epic.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtiles;

public class Department extends AppUtiles {
	
	public void department(String name,String ucode,String des,String epass)
	{
		 
		//Department Initiation
		//DMS
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		//Document Manager
     	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/a")).click();
     	//Masters
     	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
     	//Department
     	driver.findElement(By.id("DMS_Document Manager_Masters_MENU0135")).click();
     	
     //frame
     	driver.switchTo().frame(driver.findElement(By.id("bodyFrame")));
     	
     	
     	driver.findElement(By.id("RepositoryDomain_RepDomainName")).sendKeys(name);
     	driver.findElement(By.id("RepositoryDomain_InstCode")).sendKeys(ucode);
     	driver.findElement(By.id("RepositoryDomain_InstDesc")).sendKeys(des);
     	Select domain=new Select(driver.findElement(By.id("RepositoryDomain_DomainType")));
     	domain.selectByVisibleText("Department");
     	
     	
     	driver.findElement(By.id("btnSubmit")).click();
     
     	//esign
     	driver.findElement(By.xpath("//*[@id='txtESignPassword']")).sendKeys(epass);
     	driver.findElement(By.xpath("//*[@id='Submit_Esign']")).click();
    	

	}

}
