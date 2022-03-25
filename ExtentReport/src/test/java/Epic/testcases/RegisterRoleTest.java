package Epic.testcases;

import org.testng.annotations.Test;

import Epic.library.RegisterRole;
import utils.AppUtiles;

public class RegisterRoleTest extends AppUtiles {
	
	@Test
	public void registration() 
	{
		RegisterRole RR=new RegisterRole();
		RR.role("1", "level");
		
		
		
	}

}
