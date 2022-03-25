package Epic.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Epic.library.DocRepository;
import utils.AppUtiles;

public class DocRepositoryTest extends AppUtiles {
	@Parameters({"Rid","Title","Nsec","Stitle1","Sid1","Stitle2","Sid2","find"})
	@Test
	public void Repository(String Rid,String title,String Nsec,String Stitle1,String Sid1,String Stitle2,String Sid2,String find) {
		DocRepository dr=new DocRepository();
		dr.repo(Rid, title, Nsec, Stitle1, Sid1, Stitle2, Sid2, find);
		//dr.repo("DR75", "DRTitle", "2", "QA1", "QC1", "QC2", "QC2", "my");
		
	

		
	
	}

	
		
	}
	


