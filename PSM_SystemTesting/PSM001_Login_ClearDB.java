
import resources.PSM001_Login_ClearDBHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author David
 */
public class PSM001_Login_ClearDB extends PSM001_Login_ClearDBHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_ClearDB</b>
	 * Generated     : <b>Nov 12, 2012 12:16:29 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/12
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		callScript("Common_Login");
		
		// Frame: PSM Main Menu
		editSchedule().click();
		//int CourseID_selectedIndex = ((Integer)jComboBox().getProperty("selectedIndex")).intValue();
		
		if(jComboBox().getSelectedText() == "1234")
			logError("Course Not Deleted still appears in dropdown.");
		// Frame: Please Choose
		cancel().dragToScreenPoint(atPoint(9,12), pleaseChoose().getScreenPoint(atPoint(62,185)));
		cancel().click();
		
		// Frame: PSM Main Menu
		psmMainMenu(ANY,MAY_EXIT).click(atPoint(418,4));
	}
}

