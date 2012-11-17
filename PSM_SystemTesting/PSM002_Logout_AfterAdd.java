
import resources.PSM002_Logout_AfterAddHelper;
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
public class PSM002_Logout_AfterAdd extends PSM002_Logout_AfterAddHelper
{
	/**
	 * Script Name   : <b>PSM002_Logout_AfterAdd</b>
	 * Generated     : <b>Nov 12, 2012 4:15:01 PM</b>
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
		addClassSchedule().click();
		
		// Frame: Schedule Setup
		scheduleSetup().performTest(ScheduleSetup_stateVP());
		jComboBox().click();
		jComboBox().click(atText("Fall"));
		startDate().click(atPoint(75,4));
		scheduleSetup().inputKeys("01/01/12");
		endDate().click(atPoint(5,9));
		scheduleSetup().inputKeys("01/01/13");
		subject().click(atPoint(20,13));
		scheduleSetup().inputChars("Sub2");
		courseNumber().click(atPoint(26,11));
		scheduleSetup().inputChars("2345");
		courseName().click(atPoint(96,7));
		scheduleSetup().inputChars("Name2");
		jTextField().click(atPoint(47,11));
		scheduleSetup().inputChars("12:00");
		endTime().click(atPoint(37,4));
		scheduleSetup().inputChars("13:00");
		tuesday().click(atPoint(27,6));
		scheduleSetup().inputChars("12:00");
		monday().click(atPoint(19,11));
		scheduleSetup().inputChars("13:00");
		wednesday().click(atPoint(66,11));
		scheduleSetup().inputChars("12:00");
		jTextField2().click(atPoint(37,16));
		scheduleSetup().inputChars("13:00");
		thursday().click(atPoint(21,2));
		scheduleSetup().inputChars("12:00");
		jTextField3().click(atPoint(15,10));
		scheduleSetup().inputChars("13:00");
		friday().click(atPoint(8,12));
		scheduleSetup().inputChars("12:00");
		jTextField4().click(atPoint(57,12));
		scheduleSetup().inputChars("13:00");
		saturday().click(atPoint(32,18));
		scheduleSetup().inputChars("12:00");
		jTextField5().click(atPoint(37,11));
		scheduleSetup().inputChars("13:00");
		save().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		logout().click();
		
		// Frame: System Message
		youHaveSucessfullyLoggedOut().performTest(YouHaveSucessfullyLoggedOut_standardVP());
		youHaveSucessfullyLoggedOut().performTest(YouHaveSucessfullyLoggedOut_standard_2VP());
		ok(ANY,MAY_EXIT).click();
	}
}

