
import resources.PSM004_Schedule_SunnyHelper;
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
public class PSM004_Schedule_Sunny extends PSM004_Schedule_SunnyHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Sunny</b>
	 * Generated     : <b>Nov 11, 2012 5:00:42 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		callScript("Common_Login");
	    
		//Loop thru the data pool at this point
		while(!this.dpDone()){
			
			// Frame: PSM Main Menu
			addClassSchedule().click();

			// Frame: Schedule Setup
			scheduleSetup().performTest(ScheduleSetup_stateVP());
			//Semester Selection
			jComboBox().click();
			jComboBox().click(atText(dpString("Semester")));
			startDate().click(atPoint(66,14));
			scheduleSetup().inputChars(dpString("StartDate"));
			endDate().click(atPoint(27,14));
			scheduleSetup().inputChars(dpString("EndDate"));
			subject().click(atPoint(23,13));
			scheduleSetup().inputChars(dpString("CourseSubject"));
			courseNumber().click(atPoint(32,6));
			scheduleSetup().inputChars(dpString("CourseID"));
			courseName().click(atPoint(231,7));
			scheduleSetup().inputChars(dpString("CourseName"));
			jTextField().click(atPoint(28,1));
			scheduleSetup().inputChars(dpString("MonStart"));
			endTime().click(atPoint(39,5));
			scheduleSetup().inputChars(dpString("MonEnd"));
			tuesday().click(atPoint(14,14));
			scheduleSetup().inputChars(dpString("TueStart"));
			monday().click(atPoint(30,9));
			scheduleSetup().inputChars(dpString("TueEnd"));
			wednesday().click(atPoint(39,15));
			scheduleSetup().inputChars(dpString("WedStart"));
			jTextField2().click(atPoint(44,19));
			scheduleSetup().inputChars(dpString("WedEnd"));
			thursday().click(atPoint(33,9));
			scheduleSetup().inputChars(dpString("ThuStart"));
			jTextField3().click(atPoint(34,10));
			scheduleSetup().inputChars(dpString("ThuEnd"));
			friday().click(atPoint(12,15));
			scheduleSetup().inputChars(dpString("FriStart"));
			jTextField4().click(atPoint(47,8));
			scheduleSetup().inputChars(dpString("FriEnd"));
			saturday().click(atPoint(24,10));
			scheduleSetup().inputChars(dpString("SatStart"));
			jTextField5().click(atPoint(29,6));
			scheduleSetup().inputChars(dpString("SatEnd"));
			save().click();
			
			this.dpNext();
		}
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
	}
}

