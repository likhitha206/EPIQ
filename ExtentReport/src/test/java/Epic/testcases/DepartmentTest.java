package Epic.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Epic.library.Department;
import utils.AppUtiles;

public class DepartmentTest extends AppUtiles {
	@Parameters({"name","uni","des","epass"})
	@Test
	public void Dept(String name,String ucode, String des,String epass ) 
	{
		Department depr=new Department();
		depr.department(name, ucode, des, epass);
}
}