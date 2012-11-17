
import resources.PSM004_Schedule_DuplicateHelper;
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
public class PSM004_Schedule_Duplicate extends PSM004_Schedule_DuplicateHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Duplicate</b>
	 * Generated     : <b>Nov 11, 2012 9:06:35 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
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
		startDate().click(atPoint(74,11));
		scheduleSetup().inputChars("01/01/12");
		endDate().click(atPoint(44,12));
		scheduleSetup().inputChars("01/02/13");
		subject().click(atPoint(22,3));
		scheduleSetup().inputChars("Sub");
		courseNumber().click(atPoint(56,12));
		scheduleSetup().inputChars("1234");
		courseName().click(atPoint(155,7));
		scheduleSetup().inputChars("Name");
		jTextField().click(atPoint(29,5));
		scheduleSetup().inputChars("12:00");
		endTime().click(atPoint(25,3));
		scheduleSetup().inputChars("13:00");
		tuesday().click(atPoint(34,11));
		scheduleSetup().inputChars("12:00");
		monday().click(atPoint(46,5));
		scheduleSetup().inputChars("13:00");
		wednesday().click(atPoint(48,6));
		scheduleSetup().inputChars("12:00");
		jTextField2().click(atPoint(34,16));
		scheduleSetup().inputChars("13:00");
		thursday().click(atPoint(27,10));
		scheduleSetup().inputChars("12:00");
		jTextField3().click(atPoint(25,13));
		scheduleSetup().inputChars("13:00");
		friday().click(atPoint(12,8));
		scheduleSetup().inputChars("12:00");
		jTextField4().click(atPoint(26,9));
		scheduleSetup().inputChars("13:00");
		saturday().click(atPoint(31,12));
		scheduleSetup().inputChars("12:00");
		jTextField5().click(atPoint(26,11));
		scheduleSetup().inputChars("13:00");
		save().click();
		
		// Frame: PSM Main Menu
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

