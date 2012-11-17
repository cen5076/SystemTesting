
import org.eclipse.hyades.execution.runtime.datapool.IDatapoolRecord;

import resources.PSM012_EditSchedule_SunnyHelper;
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
public class PSM012_EditSchedule_Sunny extends PSM012_EditSchedule_SunnyHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_Sunny</b>
	 * Generated     : <b>Nov 11, 2012 10:35:53 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		
		callScript("Common_Login");
		
		int prevCourseId = 1234;
		int courseId = -1;
		String prevCourseSub = "Sub";
		String courseSub,courseName,semester,startDate,endDate
		,monStart,tueStart,wedStart,thuStart,friStart,satStart
		,monEnd,tueEnd,wedEnd,thuEnd,friEnd,satEnd; 
		courseSub=courseName=semester=startDate=endDate
		=monStart=tueStart=wedStart=thuStart=friStart=satStart
		=monEnd=tueEnd=wedEnd=thuEnd=friEnd=satEnd= "";
		String prevCourseName = "Name";
		String prevSemester = "Fall";
		String prevStartDate = "01/01/12";
		String prevEndDate = "01/02/13";
		String prevMonStart,prevTueStart,prevWedStart,prevThuStart,prevFriStart,prevSatStart;
		prevMonStart=prevTueStart=prevWedStart=prevThuStart=prevFriStart=prevSatStart= "12:00";
		String prevMonEnd,prevTueEnd,prevWedEnd,prevThuEnd,prevFriEnd,prevSatEnd; 
		prevMonEnd=prevTueEnd=prevWedEnd=prevThuEnd=prevFriEnd=prevSatEnd= "13:00";
		
		
		//Set the first values to default
		while(! this.dpDone()){
			
			IDatapoolRecord current = this.dpCurrent();
			
			courseId = current.getCell("CourseID").getIntValue();
			courseName = current.getCell("CourseName").getStringValue();
			courseSub = current.getCell("CourseSubject").getStringValue();
			semester = current.getCell("Semester").getStringValue();
			startDate = current.getCell("StartDate").getStringValue();
			endDate = current.getCell("EndDate").getStringValue();
			monStart = current.getCell("MonStart").getStringValue();
			monEnd = current.getCell("MonEnd").getStringValue();
			tueStart = current.getCell("TueStart").getStringValue();
			tueEnd = current.getCell("TueEnd").getStringValue();
			wedStart = current.getCell("WedStart").getStringValue();
			wedEnd = current.getCell("WedStart").getStringValue();
			thuStart = current.getCell("ThuStart").getStringValue();
			thuEnd = current.getCell("ThuEnd").getStringValue();
			friStart = current.getCell("FriStart").getStringValue();
			friEnd = current.getCell("FriEnd").getStringValue();
			satStart = current.getCell("FriEnd").getStringValue();
			satEnd = current.getCell("SatEnd").getStringValue();
			
			
			// Frame: PSM Main Menu
			editSchedule().click();
			
			// Frame: Please Choose
			pleaseChoose().performTest(PleaseChoose_stateVP());
			jComboBox().click();
			//click at the course in drop down
			jComboBox().click(atText(String.valueOf(courseId)));
			edit().click();
			
			// Frame: Edit Schedule
			editSchedule2().performTest(EditSchedule_stateVP());
			String CourseID_text = (String)courseNumber().getProperty("text");
			
			//verify value of courseid
			compareText(CourseID_text,String.valueOf(prevCourseId));
			
			courseNumber().click(atPoint(50,7));
			//remove old value
			editSchedule2().inputKeys("^a{BKSP}");
			//add new value
			editSchedule2().inputChars(String.valueOf(courseId));
			
			String Subject_text = (String)subject().getProperty("text");
			
			//verify value of subject
			compareText(Subject_text,prevCourseSub);
			
			//remove old value
			subject().click(atPoint(30,13));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new value
			editSchedule2().inputChars(courseSub);
			
			String CourseName_text = (String)courseName().getProperty("text");
			
			//verify value of name
			compareText(CourseName_text,prevCourseName);
			
			//remove old value
			courseName().click(atPoint(3,10));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new value
			editSchedule2().inputChars(courseName);
			
			//int Semester_selectedIndex = ((Integer)jComboBox2().getProperty("selectedIndex")).intValue();
			String Semester_select = jComboBox2().getText();
			//verify value of semester
			compareText(Semester_select,prevSemester);
			
			//set new value
			jComboBox2().click();
			jComboBox2().click(atText(semester));
			
			String StartDate_text = (String)startDate().getProperty("text");
			
			//verify value of start date
			compareText(StartDate_text,prevStartDate);
			
			//remove old value
			startDate().click(atPoint(49,10));
			editSchedule2().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}");
			editSchedule2().inputChars(startDate);
			
			String EndDate_text = (String)endDate().getProperty("text");
			
			//verify value of end date
			compareText(EndDate_text,prevEndDate);
			
			//remove old value
			endDate().click(atPoint(67,10));
			editSchedule2().inputKeys("{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}{BKSP}");
			
			//add new value
			editSchedule2().inputChars(endDate);
			
			String MonStart_text = (String)jTextField().getProperty("text");
			
			compareText(MonStart_text,prevMonStart);
			
			jTextField().click(atPoint(3,9));
			
			//remove old values
			editSchedule2().inputKeys("^a{BKSP}");
			//add new values
			editSchedule2().inputChars(monStart);
			
			String MonEnd_text = (String)endTime().getProperty("text");
			
			compareText(MonEnd_text,prevMonEnd);
			
			//remove old values
			endTime().click(atPoint(2,3));
			//add new values
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(monEnd);
			
			String TueStart_text = (String)tuesday().getProperty("text");
			compareText(TueStart_text,prevTueStart);
			
			//remove old value
			tuesday().click(atPoint(2,7));
			//add new value
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(tueStart);
			
			String TueEnd_text = (String)monday().getProperty("text");
			compareText(TueEnd_text,prevTueEnd);
			
			//remove old values
			monday().click(atPoint(4,0));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new values
			editSchedule2().inputChars(tueEnd);
			
			String WedStart_text = (String)wednesday().getProperty("text");
			compareText(WedStart_text,prevWedStart);
			//remove old text
			wednesday().click(atPoint(0,3));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new value
			editSchedule2().inputChars(wedStart);
			
			String WedEnd_text = (String)jTextField2().getProperty("text");
			
			compareText(WedEnd_text,prevWedEnd);
			
			//remove old values
			jTextField2().click(atPoint(3,15));
			jTextField2().hover(atPoint(3,15));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new values
			editSchedule2().inputChars(wedEnd);
			
			String ThuStart_text = (String)thursday().getProperty("text");
			compareText(ThuStart_text,prevThuStart);
			
			//remove old values
			thursday().click(atPoint(2,13));
			editSchedule2().inputKeys("^a{BKSP}");
			//add new values
			editSchedule2().inputChars(thuStart);
			
			String ThuEnd_text = (String)jTextField3().getProperty("text");
			
			compareText(ThuEnd_text,prevThuEnd);
			
			//remove old values
			jTextField3().click(atPoint(4,14));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(thuEnd);
			
			String FriStart_text = (String)friday().getProperty("text");
			
			compareText(FriStart_text,prevFriStart);
			
			friday().click(atPoint(5,10));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(friStart);
			
			String FriEnd_text = (String)jTextField4().getProperty("text");
			
			compareText(FriEnd_text,prevFriEnd);
			
			jTextField4().click(atPoint(3,8));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(friEnd);
			
			String SatStart_text = (String)saturday().getProperty("text");
			
			compareText(SatStart_text,prevSatStart);
			saturday().click(atPoint(5,17));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(satStart);
			
			String SatEnd_text = (String)jTextField5().getProperty("text");
			
			compareText(SatEnd_text,prevSatEnd);
			
			jTextField5().click(atPoint(2,9));
			editSchedule2().inputKeys("^a{BKSP}");
			editSchedule2().inputChars(satEnd);
			save().click();
			
			// Frame: PSM Main Menu
			psmMainMenu().performTest(PSMMainMenu_stateVP());
			
			this.dpNext();
			if(!this.dpDone()){
				
				
				prevCourseId = courseId;
				prevCourseName = courseName;
				prevCourseSub = courseSub; 
				prevSemester = semester; 
				prevStartDate = startDate;
				prevEndDate = endDate; 
				prevMonStart = monStart;
				prevMonEnd = monEnd; 
				prevTueStart = tueStart; 
				prevTueEnd = tueEnd; 
				prevWedStart = wedStart; 
				prevWedEnd = wedEnd; 
				prevThuStart = thuStart; 
				prevThuEnd = thuEnd; 
				prevFriStart = friStart; 
				prevFriEnd = friEnd; 
				prevSatStart = satStart; 
				prevSatEnd = satEnd; 
				
			}
		}
		psmMainMenu().dragToScreenPoint(atPoint(431,10), toScreenPoint(
                                        309, 68));
		logout().click();
		
		// Frame: System Message
		youHaveSucessfullyLoggedOut().performTest(YouHaveSucessfullyLoggedOut_standardVP());
		ok(ANY,MAY_EXIT).click();
	}
	
	private void compareText(String textValue,String prevValue){
		
		if(textValue != prevValue)
			logError("Value " + textValue + " not equal to expected " + prevValue);
	}
}

