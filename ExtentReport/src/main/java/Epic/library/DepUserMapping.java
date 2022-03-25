package Epic.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtiles;

public class DepUserMapping extends AppUtiles {

  public void UserMapping(String search,String Sdata,String Adep ) 
  {
	   
	  
	//DMS
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		//Document Manager
      	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/a")).click();
   	//Masters
    	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
   	//Department-user Mapping
    	driver.findElement(By.id("DMS_Document Manager_Masters_MENU0136")).click();
   	//frame
    	driver.switchTo().frame(driver.findElement(By.id("bodyFrame")));
   	//Advance button
    	driver.findElement(By.id("btnAdvSearch")).click();
    	
    	Select searchby=new Select(driver.findElement(By.id("SearchType")));
     	searchby.selectByVisibleText(search);
     	
     	driver.findElement(By.id("SrhDescription")).clear();
    	driver.findElement(By.id("SrhDescription")).sendKeys(Sdata);
    	driver.findElement(By.id("displayBtn")).click();
    	
    	List<WebElement>rows=driver.findElements(By.id("ListTab"));
    	rows.get(0).click();
    	
    	//available search
    	driver.findElement(By.xpath("/html/body/form/section/section/div/div/div/div/div[1]/div/div[2]/div/div[3]/div/div/div[2]/div[1]/div/input")).sendKeys(Adep);
    	
    	//double forward
    	driver.findElement(By.id("RepDom_Left_rightAll")).click();
    	//single forward button click
    	//driver.findElement(By.id("RepDom_Left_rightSelected")).click();
    	driver.findElement(By.id("btnSubmit")).click();
    	
    	
    	
    	
    	
    	
  }
}

