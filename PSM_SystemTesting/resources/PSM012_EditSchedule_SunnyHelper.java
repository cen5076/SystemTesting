// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>PSM012_EditSchedule_Sunny</b><br>
 * Generated     : <b>2012/11/11 10:54:19 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 11, 2012
 * @author David
 */
public abstract class PSM012_EditSchedule_SunnyHelper extends RationalTestScript
{
	/**
	 * CourseName: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Course Name:
	 * 		.classIndex : 4
	 */
	protected TextGuiSubitemTestObject courseName() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courseName"));
	}
	/**
	 * CourseName: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Course Name:
	 * 		.classIndex : 4
	 */
	protected TextGuiSubitemTestObject courseName(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courseName"), anchor, flags);
	}
	
	/**
	 * CourseNumber: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Course Number:
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject courseNumber() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courseNumber"));
	}
	/**
	 * CourseNumber: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Course Number:
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject courseNumber(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courseNumber"), anchor, flags);
	}
	
	/**
	 * Edit: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Edit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject edit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("edit"));
	}
	/**
	 * Edit: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Edit
	 * 		.classIndex : 0
	 */
	protected GuiTestObject edit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("edit"), anchor, flags);
	}
	
	/**
	 * EditSchedule: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Edit Schedule
	 * 		.classIndex : 7
	 */
	protected GuiTestObject editSchedule() 
	{
		return new GuiTestObject(
                        getMappedTestObject("editSchedule"));
	}
	/**
	 * EditSchedule: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Edit Schedule
	 * 		.classIndex : 7
	 */
	protected GuiTestObject editSchedule(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("editSchedule"), anchor, flags);
	}
	
	/**
	 * EditSchedule: with default state.
	 *		.captionText : Edit Schedule
	 * 		.class : Interface.PrefilledScheduleForm
	 * 		accessibleContext.accessibleName : Edit Schedule
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject editSchedule2() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("editSchedule2"));
	}
	/**
	 * EditSchedule: with specific test context and state.
	 *		.captionText : Edit Schedule
	 * 		.class : Interface.PrefilledScheduleForm
	 * 		accessibleContext.accessibleName : Edit Schedule
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject editSchedule2(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("editSchedule2"), anchor, flags);
	}
	
	/**
	 * EndDate: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : End Date:
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject endDate() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("endDate"));
	}
	/**
	 * EndDate: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : End Date:
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject endDate(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("endDate"), anchor, flags);
	}
	
	/**
	 * EndTime: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : End Time:
	 * 		.classIndex : 5
	 */
	protected TextGuiSubitemTestObject endTime() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("endTime"));
	}
	/**
	 * EndTime: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : End Time:
	 * 		.classIndex : 5
	 */
	protected TextGuiSubitemTestObject endTime(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("endTime"), anchor, flags);
	}
	
	/**
	 * Friday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Friday
	 * 		.classIndex : 14
	 */
	protected TextGuiSubitemTestObject friday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("friday"));
	}
	/**
	 * Friday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Friday
	 * 		.classIndex : 14
	 */
	protected TextGuiSubitemTestObject friday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("friday"), anchor, flags);
	}
	
	/**
	 * JComboBox: with default state.
	 *		.itemCount : 2
	 * 		.itemText : {1234,2345}
	 * 		.class : javax.swing.JComboBox
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject jComboBox() 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("jComboBox"));
	}
	/**
	 * JComboBox: with specific test context and state.
	 *		.itemCount : 2
	 * 		.itemText : {1234,2345}
	 * 		.class : javax.swing.JComboBox
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject jComboBox(TestObject anchor, long flags) 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("jComboBox"), anchor, flags);
	}
	
	/**
	 * JComboBox: with default state.
	 *		.itemCount : 6
	 * 		.itemText : {Select Semester,Fall,Spring,Summer A,Summer B,Summer C}
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : (m/dd/yy)
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject jComboBox2() 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("jComboBox2"));
	}
	/**
	 * JComboBox: with specific test context and state.
	 *		.itemCount : 6
	 * 		.itemText : {Select Semester,Fall,Spring,Summer A,Summer B,Summer C}
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : (m/dd/yy)
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject jComboBox2(TestObject anchor, long flags) 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("jComboBox2"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 6
	 */
	protected TextGuiSubitemTestObject jTextField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 6
	 */
	protected TextGuiSubitemTestObject jTextField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 9
	 */
	protected TextGuiSubitemTestObject jTextField2() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField2"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 9
	 */
	protected TextGuiSubitemTestObject jTextField2(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField2"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 11
	 */
	protected TextGuiSubitemTestObject jTextField3() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField3"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 11
	 */
	protected TextGuiSubitemTestObject jTextField3(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField3"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 13
	 */
	protected TextGuiSubitemTestObject jTextField4() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField4"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 13
	 */
	protected TextGuiSubitemTestObject jTextField4(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField4"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 15
	 */
	protected TextGuiSubitemTestObject jTextField5() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField5"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 15
	 */
	protected TextGuiSubitemTestObject jTextField5(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField5"), anchor, flags);
	}
	
	/**
	 * Logout: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Logout
	 * 		.classIndex : 8
	 */
	protected GuiTestObject logout() 
	{
		return new GuiTestObject(
                        getMappedTestObject("logout"));
	}
	/**
	 * Logout: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Logout
	 * 		.classIndex : 8
	 */
	protected GuiTestObject logout(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("logout"), anchor, flags);
	}
	
	/**
	 * Monday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Monday
	 * 		.classIndex : 7
	 */
	protected TextGuiSubitemTestObject monday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("monday"));
	}
	/**
	 * Monday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Monday
	 * 		.classIndex : 7
	 */
	protected TextGuiSubitemTestObject monday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("monday"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : You have sucessfully logged out.
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : You have sucessfully logged out.
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
	}
	
	/**
	 * PleaseChoose: with default state.
	 *		.captionText : Please Choose
	 * 		.class : Interface.courseSelect
	 * 		accessibleContext.accessibleName : Please Choose
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject pleaseChoose() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("pleaseChoose"));
	}
	/**
	 * PleaseChoose: with specific test context and state.
	 *		.captionText : Please Choose
	 * 		.class : Interface.courseSelect
	 * 		accessibleContext.accessibleName : Please Choose
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject pleaseChoose(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("pleaseChoose"), anchor, flags);
	}
	
	/**
	 * PSMMainMenu: with default state.
	 *		.captionText : PSM Main Menu
	 * 		.class : Interface.MainMenu
	 * 		accessibleContext.accessibleName : PSM Main Menu
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmMainMenu() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmMainMenu"));
	}
	/**
	 * PSMMainMenu: with specific test context and state.
	 *		.captionText : PSM Main Menu
	 * 		.class : Interface.MainMenu
	 * 		accessibleContext.accessibleName : PSM Main Menu
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmMainMenu(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmMainMenu"), anchor, flags);
	}
	
	/**
	 * Saturday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Saturday
	 * 		.classIndex : 16
	 */
	protected TextGuiSubitemTestObject saturday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("saturday"));
	}
	/**
	 * Saturday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Saturday
	 * 		.classIndex : 16
	 */
	protected TextGuiSubitemTestObject saturday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("saturday"), anchor, flags);
	}
	
	/**
	 * Save: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Save
	 * 		.classIndex : 0
	 */
	protected GuiTestObject save() 
	{
		return new GuiTestObject(
                        getMappedTestObject("save"));
	}
	/**
	 * Save: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Save
	 * 		.classIndex : 0
	 */
	protected GuiTestObject save(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("save"), anchor, flags);
	}
	
	/**
	 * StartDate: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Start Date:
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject startDate() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("startDate"));
	}
	/**
	 * StartDate: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Start Date:
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject startDate(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("startDate"), anchor, flags);
	}
	
	/**
	 * Subject: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Subject:
	 * 		.classIndex : 2
	 */
	protected TextGuiSubitemTestObject subject() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("subject"));
	}
	/**
	 * Subject: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Subject:
	 * 		.classIndex : 2
	 */
	protected TextGuiSubitemTestObject subject(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("subject"), anchor, flags);
	}
	
	/**
	 * TEDEDYouTubeGoogleChrome: with default state.
	 *		.text : TED-ED - YouTube - Google Chrome
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : chrome.exe
	 * 		.name : TED-ED - YouTube - Google Chrome
	 */
	protected TopLevelSubitemTestObject tededYouTubeGoogleChromewindow() 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("tededYouTubeGoogleChromewindow"));
	}
	/**
	 * TEDEDYouTubeGoogleChrome: with specific test context and state.
	 *		.text : TED-ED - YouTube - Google Chrome
	 * 		.class : Chrome_WidgetWin_1
	 * 		.processName : chrome.exe
	 * 		.name : TED-ED - YouTube - Google Chrome
	 */
	protected TopLevelSubitemTestObject tededYouTubeGoogleChromewindow(TestObject anchor, long flags) 
	{
		return new TopLevelSubitemTestObject(
                        getMappedTestObject("tededYouTubeGoogleChromewindow"), anchor, flags);
	}
	
	/**
	 * Thursday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Thursday
	 * 		.classIndex : 12
	 */
	protected TextGuiSubitemTestObject thursday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("thursday"));
	}
	/**
	 * Thursday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Thursday
	 * 		.classIndex : 12
	 */
	protected TextGuiSubitemTestObject thursday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("thursday"), anchor, flags);
	}
	
	/**
	 * Tuesday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Tuesday
	 * 		.classIndex : 8
	 */
	protected TextGuiSubitemTestObject tuesday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tuesday"));
	}
	/**
	 * Tuesday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Tuesday
	 * 		.classIndex : 8
	 */
	protected TextGuiSubitemTestObject tuesday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tuesday"), anchor, flags);
	}
	
	/**
	 * Wednesday: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Wednesday
	 * 		.classIndex : 10
	 */
	protected TextGuiSubitemTestObject wednesday() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("wednesday"));
	}
	/**
	 * Wednesday: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Wednesday
	 * 		.classIndex : 10
	 */
	protected TextGuiSubitemTestObject wednesday(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("wednesday"), anchor, flags);
	}
	
	/**
	 * YouHaveSucessfullyLoggedOut: with default state.
	 *		text : You have sucessfully logged out.
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : You have sucessfully logged out.
	 * 		name : Message
	 * 		.classIndex : 0
	 */
	protected GuiTestObject youHaveSucessfullyLoggedOut() 
	{
		return new GuiTestObject(
                        getMappedTestObject("youHaveSucessfullyLoggedOut"));
	}
	/**
	 * YouHaveSucessfullyLoggedOut: with specific test context and state.
	 *		text : You have sucessfully logged out.
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : You have sucessfully logged out.
	 * 		name : Message
	 * 		.classIndex : 0
	 */
	protected GuiTestObject youHaveSucessfullyLoggedOut(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("youHaveSucessfullyLoggedOut"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point EditSchedule_state object in the SUT.
	 */
	protected IFtVerificationPoint EditSchedule_stateVP() 
	{
		return vp("EditSchedule_state");
	}
	protected IFtVerificationPoint EditSchedule_stateVP(TestObject anchor)
	{
		return vp("EditSchedule_state", anchor);
	}
	
	/**
	 * Locate and return the verification point PleaseChoose_state object in the SUT.
	 */
	protected IFtVerificationPoint PleaseChoose_stateVP() 
	{
		return vp("PleaseChoose_state");
	}
	protected IFtVerificationPoint PleaseChoose_stateVP(TestObject anchor)
	{
		return vp("PleaseChoose_state", anchor);
	}
	
	/**
	 * Locate and return the verification point PSMMainMenu_state object in the SUT.
	 */
	protected IFtVerificationPoint PSMMainMenu_stateVP() 
	{
		return vp("PSMMainMenu_state");
	}
	protected IFtVerificationPoint PSMMainMenu_stateVP(TestObject anchor)
	{
		return vp("PSMMainMenu_state", anchor);
	}
	
	/**
	 * Locate and return the verification point YouHaveSucessfullyLoggedOut_standard object in the SUT.
	 */
	protected IFtVerificationPoint YouHaveSucessfullyLoggedOut_standardVP() 
	{
		return vp("YouHaveSucessfullyLoggedOut_standard");
	}
	protected IFtVerificationPoint YouHaveSucessfullyLoggedOut_standardVP(TestObject anchor)
	{
		return vp("YouHaveSucessfullyLoggedOut_standard", anchor);
	}
	
	

	protected PSM012_EditSchedule_SunnyHelper()
	{
		setScriptName("PSM012_EditSchedule_Sunny");
	}
	
}
