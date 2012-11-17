
import resources.PSM001_Login_SunnyHelper;
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
public class PSM001_Login_Sunny extends PSM001_Login_SunnyHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Sunny</b>
	 * Generated     : <b>Nov 11, 2012 3:20:09 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 * @datapool ValidUsers
	 */
	public void testMain(Object[] args) 
	{
		startApp("psm");
		
		// Frame: PSM Login
		username().click(atPoint(18,5));
		psmLogin().inputChars(dpString("Username"));
		password().click(atPoint(16,10));
		psmLogin().inputChars(dpString("Password"));
		login().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

