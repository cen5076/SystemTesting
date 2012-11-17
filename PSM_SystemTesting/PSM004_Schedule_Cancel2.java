
import resources.PSM004_Schedule_Cancel2Helper;
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
public class PSM004_Schedule_Cancel2 extends PSM004_Schedule_Cancel2Helper
{
	/**
	 * Script Name   : <b>PSM004_Schedule_Cancel2</b>
	 * Generated     : <b>Nov 13, 2012 5:32:45 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/13
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		callScript("Common_Login");
		
		// Frame: PSM Main Menu
		addClassSchedule().click();
		
		// Frame: Schedule Setup
		scheduleSetup().performTest(ScheduleSetup_stateVP());
		cancel().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

