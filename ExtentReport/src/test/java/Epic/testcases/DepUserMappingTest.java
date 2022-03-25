package Epic.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Epic.library.DepUserMapping;
import utils.AppUtiles;

public class DepUserMappingTest extends AppUtiles {
	@Parameters({"searchid","Sdata","Adep"})
	@Test
	public void DuMappping(String search,String Sdata,String Adep ) {
		DepUserMapping dm=new DepUserMapping();
		dm.UserMapping(search,Sdata,Adep);
	}

}
