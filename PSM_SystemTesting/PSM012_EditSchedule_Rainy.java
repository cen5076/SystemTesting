
import resources.PSM012_EditSchedule_RainyHelper;
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
public class PSM012_EditSchedule_Rainy extends PSM012_EditSchedule_RainyHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_Rainy</b>
	 * Generated     : <b>Nov 12, 2012 2:42:51 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/12
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		callScript("Common_Login");
		
		
		while(!this.dpDone()){
			// Frame: PSM Main Menu
			editSchedule().click();
			
			// Frame: Please Choose
			pleaseChoose().performTest(PleaseChoose_stateVP());
			jComboBox().click();
			jComboBox().click(atText(dpString("CourseId")));
			edit().click();
			String CourseId_text = (String)courseNumber().getProperty("text");
			if(CourseId_text != dpString("CourseId"))
				logError("Invalid Course in Edit should be " + dpString("CourseId") + " found " + CourseId_text);
			
			//int Semester_selectedIndex = ((Integer)jComboBox2().getProperty("selectedIndex")).intValue();
			
			// Frame: Edit Schedule
			jComboBox2().click();
			jComboBox2().click(atText(dpString("Semester")));
			startDate().click(atPoint(4,10));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("StartDate"));
			endDate().click(atPoint(3,7));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("EndDate"));
			subject().click(atPoint(4,11));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("CourseSub"));
			courseName().click(atPoint(0,15));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("CourseName"));
			jTextField().click(atPoint(0,5));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("MonStart"));
			endTime().click(atPoint(1,12));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("MonEnd"));
			tuesday().click(atPoint(5,14));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("TueStart"));
			monday().click(atPoint(0,8));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("TueEnd"));
			wednesday().click(atPoint(3,15));
			wednesday().hover(atPoint(1,15));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("WedStart"));
			jTextField2().click(atPoint(4,7));
			editSchedule2().inputKeys("^a");
			editSchedule2().inputChars(dpString("WedEnd"));
			thursday().click(atPoint(0,9));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("ThuStart"));
			jTextField3().click(atPoint(4,10));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("ThuEnd"));
			friday().click(atPoint(3,11));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("FriStart"));
			jTextField4().click(atPoint(1,17));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("FriEnd"));
			saturday().click(atPoint(8,14));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("SatStart"));
			jTextField5().click(atPoint(3,17));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(dpString("SatEnd"));
			save().click();
			
			// Frame: PSM Main Menu
			psmMainMenu().performTest(PSMMainMenu_stateVP());
		
			this.dpNext();
		}
		
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

