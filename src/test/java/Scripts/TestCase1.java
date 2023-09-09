package Scripts;

import genericLibrary.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtoCart d = new AddtoCart(driver);
		utilies.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
		
	}
	
}
