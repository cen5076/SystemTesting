
import resources.PSM002_Logout_CancelHelper;
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
public class PSM002_Logout_Cancel extends PSM002_Logout_CancelHelper
{
	/**
	 * Script Name   : <b>PSM002_Logout_Cancel</b>
	 * Generated     : <b>Nov 11, 2012 4:25:27 PM</b>
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
		logout().click();
		
		// Frame: System Message
		youHaveSucessfullyLoggedOut().performTest(YouHaveSucessfullyLoggedOut_standardVP());
		systemMessage().click(atPoint(200,167));
		
		
		System.out.println("Failed no Cancel Button Implemented");
		systemMessage(ANY,MAY_EXIT).close();
	}
}

