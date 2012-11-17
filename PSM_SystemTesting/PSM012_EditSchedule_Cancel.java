
import resources.PSM012_EditSchedule_CancelHelper;
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
public class PSM012_EditSchedule_Cancel extends PSM012_EditSchedule_CancelHelper
{
	/**
	 * Script Name   : <b>PSM012_EditSchedule_Cancel</b>
	 * Generated     : <b>Nov 11, 2012 9:34:43 PM</b>
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
		editSchedule().click();
		
		// Frame: Please Choose
		pleaseChoose().performTest(PleaseChoose_stateVP());
		jComboBox().click();
		jComboBox().click(atText("1234"));
		int courseSelect_Index = ((Integer)jComboBox().getProperty("selectedIndex")).intValue();
		if (courseSelect_Index != 0){
			logError("Invalid Course in Drop Down");
		}
		cancel().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

