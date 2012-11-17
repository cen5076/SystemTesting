
import resources.PSM012_EditSchedule_RainyCourseIDHelper;
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
public class PSM012_EditSchedule_RainyCourseID extends PSM012_EditSchedule_RainyCourseIDHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_RainyCourseID</b>
	 * Generated     : <b>Nov 12, 2012 3:58:32 PM</b>
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
		pleaseChoose().performTest(PleaseChoose_stateVP());
		jComboBox().click();
		jComboBox().click(atText("1234"));
		edit().click();
		
		// Frame: Edit Schedule
		courseNumber().click(atPoint(2,9));
		editSchedule2().inputKeys("^a{BKSP}");
		editSchedule2().inputChars("2345");
		save().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		psmMainMenu(ANY,MAY_EXIT).close();

	}
}

