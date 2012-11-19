
import resources.PSM004_Schedule_RainyHelper;
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
public class PSM004_Schedule_Rainy extends PSM004_Schedule_RainyHelper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Rainy</b>
	 * Generated     : <b>Nov 11, 2012 7:49:16 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		
		
		//traverse entire data pool
		while(!this.dpDone()){
			//Valid Login
			callScript("Common_Login");
			
			// Frame: PSM Main Menu
			addClassSchedule().click();
			
			// Frame: Schedule Setup
			jComboBox().click();
			//Select Semester from dropDown
			jComboBox().click(atText(dpString("Semester")));
			startDate().click(atPoint(62,11));
			scheduleSetup().inputChars(dpString("StartDate"));
			endDate().click(atPoint(29,7));
			scheduleSetup().inputChars(dpString("EndDate"));
			subject().click(atPoint(23,15));
			scheduleSetup().inputChars(dpString("CourseSubject"));
			courseNumber().click(atPoint(27,10));
			scheduleSetup().inputChars(dpString("CourseId"));
			courseName().click(atPoint(79,8));
			scheduleSetup().inputChars(dpString("CourseName"));
			jTextField().click(atPoint(42,6));
			scheduleSetup().inputChars(dpString("MonStart"));
			endTime().click(atPoint(26,16));
			scheduleSetup().inputChars(dpString("MonEnd"));
			tuesday().click(atPoint(54,8));
			scheduleSetup().inputChars(dpString("TueStart"));
			monday().click(atPoint(38,9));
			scheduleSetup().inputChars(dpString("TueEnd"));
			wednesday().click(atPoint(22,8));
			scheduleSetup().inputChars(dpString("WedStart"));
			jTextField2().click(atPoint(33,8));
			scheduleSetup().inputChars(dpString("WedEnd"));
			thursday().click(atPoint(27,12));
			scheduleSetup().inputChars(dpString("ThuStart"));
			jTextField3().click(atPoint(23,11));
			scheduleSetup().inputChars(dpString("ThuEnd"));
			friday().click(atPoint(26,2));
			scheduleSetup().inputChars(dpString("FriStart"));
			jTextField4().doubleClick(atPoint(28,4));
			scheduleSetup().inputChars(dpString("FriEnd"));
			saturday().click(atPoint(30,11));
			scheduleSetup().inputChars(dpString("SatStart"));
			jTextField5().click(atPoint(32,11));
			scheduleSetup().inputChars(dpString("SatEnd"));
			save().click();
			scheduleSetup().performTest(ScheduleSetup_stateVP());
			cancel().click();
			
			// Frame: PSM Main Menu
			psmMainMenu(ANY,MAY_EXIT).close();
			
			this.dpNext();
	}
		
	}
}

