package Epic.testcases;


//import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import Epic.library.Department;
import Epic.library.EpicLoginPage;
import utils.AppUtiles;

public class EpicLoginTest extends AppUtiles {
	@Parameters({"cmp","epiquid","epiqpwd"})
	@Test
	public void login(String cl,String name,String pwd) {
		EpicLoginPage lp=new EpicLoginPage();
		lp.login(cl, name, pwd);
		//boolean res=lp.isDMSModuleDisplayed();
		//Assert.assertFalse(res);
		//lp.logout();
	}
	
	}


