
import resources.PSM004_Schedule_MultipleHelper;
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
public class PSM004_Schedule_Multiple extends PSM004_Schedule_MultipleHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Multiple</b>
	 * Generated     : <b>Nov 18, 2012 6:57:01 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/18
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		callScript("Common_Login");
		
		// Frame: PSM Main Menu
		addClassSchedule().click();
		
		// Frame: Schedule Setup
		scheduleSetup().waitForExistence(10.0, 2.0);
		scheduleSetup().performTest(ScheduleSetup_standardVP());
		scheduleSetup().performTest(ScheduleSetup_stateVP(), 1.0, 10.0);
		jComboBox().click();
		jComboBox().click(atText("Fall"));
		startDate().click(atPoint(55,9));
		scheduleSetup().inputKeys("01/02/12");
		endDate().click(atPoint(38,1));
		scheduleSetup().inputChars("01/02/13");
		subject().click(atPoint(17,12));
		scheduleSetup().inputChars("Subject");
		scheduleSetup().click(atPoint(376,211));
		courseNumber().click(atPoint(38,13));
		scheduleSetup().inputChars("abcd");
		courseName().click(atPoint(210,10));
		scheduleSetup().inputChars("Name");
		jTextField().click(atPoint(22,10));
		scheduleSetup().inputChars("12:00");
		endTime().click(atPoint(51,16));
		scheduleSetup().inputChars("13:00");
		tuesday().click(atPoint(17,12));
		scheduleSetup().inputChars("12:00");
		monday().click(atPoint(58,15));
		scheduleSetup().inputKeys("13:00");
		wednesday().click(atPoint(14,17));
		scheduleSetup().inputChars("12:00");
		jTextField2().click(atPoint(48,9));
		scheduleSetup().inputChars("13:00");
		thursday().click(atPoint(32,7));
		scheduleSetup().inputChars("12:00");
		jTextField3().click(atPoint(52,11));
		scheduleSetup().inputChars("13:00");
		friday().click(atPoint(59,14));
		scheduleSetup().inputChars("12:00");
		jTextField4().click(atPoint(31,5));
		scheduleSetup().inputChars("13:00");
		saturday().click(atPoint(39,16));
		scheduleSetup().inputChars("12:00");
		jTextField5().click(atPoint(63,17));
		scheduleSetup().inputChars("13:00");
		cancel().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().waitForExistence(10.0, 2.0);
		psmMainMenu().performTest(PSMMainMenu_stateVP(), 1.0, 10.0);
		
		// Frame: PSM Main Menu
		addClassSchedule().drag();
		
		// Frame: Schedule Setup
		scheduleSetup().waitForExistence(10.0, 2.0);
		scheduleSetup().performTest(ScheduleSetup_state_2VP(), 1.0, 
                              10.0);
		cancel().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().waitForExistence(10.0, 2.0);
		psmMainMenu().performTest(PSMMainMenu_stateVP(), 1.0, 10.0);
		psmMainMenu(ANY,MAY_EXIT).click(atPoint(431,6));
	}
}

