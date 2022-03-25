package Epic.library;

import org.openqa.selenium.By;

import utils.AppUtiles;

public class DocRepository extends AppUtiles {
	
	public void repo(String Rid,String title,String Nsec,String Stitle1,String Sid1,String Stitle2,String Sid2,String find) {
		
		//DMS
				driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
				//Document Manager
		     	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/a")).click();
		     	//Masters
		     	driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
		     	//Document Repository
		     	driver.findElement(By.id("DMS_Document Manager_Masters_MENU0108")).click();
		     	
		     	//frame
		     	driver.switchTo().frame(driver.findElement(By.id("bodyFrame")));
		     	
		     	driver.findElement(By.id("ENoteBook_ENoteBookCode")).sendKeys(Rid);
		     	driver.findElement(By.id("ENoteBook_ENoteBookDesc")).sendKeys(title);
		     	driver.findElement(By.id("ENoteBook_NoOfSections")).clear();
		     	driver.findElement(By.id("ENoteBook_NoOfSections")).sendKeys(Nsec);
		     	driver.findElement(By.xpath("/html/body/form/section/section/div/div/div/div[1]/div")).click();
		     	driver.findElement(By.id("ENoteBook_RepositorySections0_SectionTitle")).sendKeys(Stitle1);
		     	driver.findElement(By.id("ENoteBook_RepositorySections0_SectionID")).sendKeys(Sid1);
		     	driver.findElement(By.id("ENoteBook_RepositorySections1_SectionTitle")).sendKeys(Stitle2);
		     	driver.findElement(By.id("ENoteBook_RepositorySections1_SectionID")).sendKeys(Sid2);
		     	
		     	//department
		     	driver.findElement(By.id("btnModal_ENoteBook_Location")).click();
		     	//find repository
		     	driver.findElement(By.id("ENoteBook_Location_FindTxt")).sendKeys(find);
		     	//apply
		     	driver.findElement(By.id("ENoteBook_Location_DisplayBtn")).click();
		     	
		     	driver.findElement(By.id("ListTab"));
		     	driver.findElement(By.xpath("//input[@type='radio' and @class='radioCls margin-right-10']")).click();
		    	driver.findElement(By.id("ENoteBook_Location_selectBtn")).click();
		     	
		    	//submit
		    	driver.findElement(By.id("btnSubmit")).click();
		     	
		     	
		
	

}
}