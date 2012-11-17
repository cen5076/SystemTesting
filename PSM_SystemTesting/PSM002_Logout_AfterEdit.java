
import resources.PSM002_Logout_AfterEditHelper;
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
public class PSM002_Logout_AfterEdit extends PSM002_Logout_AfterEditHelper
{
	/**
	 * Script Name   : <b>PSM002_Logout_AfterEdit</b>
	 * Generated     : <b>Nov 12, 2012 4:07:49 PM</b>
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
		
		// Frame: Please Choose
		jComboBox().click();
		jComboBox().click(atText("1234"));
		edit().click();
		
		// Frame: Edit Schedule
		courseName().click(atPoint(209,15));
		editSchedule2().inputKeys("^a{BKSP}");
		editSchedule2().inputChars("Name2");
		subject().click(atPoint(32,10));
		editSchedule2().inputKeys("^a{BKSP}");
		editSchedule2().inputChars("Sub2");
		startDate().click(atPoint(1,9));
		editSchedule2().inputKeys("^a{BKSP}");
		editSchedule2().inputChars("02/01/12");
		endDate().click(atPoint(80,14));
		editSchedule2().inputKeys("^a{BKSP}");
		editSchedule2().inputChars("02/02/13");
		save().click();
		
		// Frame: PSM Main Menu
		logout().click();
		
		// Frame: System Message
		youHaveSucessfullyLoggedOut().performTest(YouHaveSucessfullyLoggedOut_standardVP());
		ok(ANY,MAY_EXIT).click();
	}
}

