
import resources.PSM001_Login_IncorrectHelper;
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
public class PSM001_Login_Incorrect extends PSM001_Login_IncorrectHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Incorrect</b>
	 * Generated     : <b>Nov 11, 2012 4:47:27 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 * @datapool InvalidUsers
	 */
	public void testMain(Object[] args) 
	{
		startApp("psm");
		
		// Frame: PSM Login
		username().click(atPoint(28,9));
		psmLogin().inputChars(dpString("Username"));
		password().click(atPoint(7,15));
		psmLogin().inputChars(dpString("Password"));
		login().click();
		
		// Frame: System Message
		incorrectUsernamePassword().performTest(IncorrectUsernamePassword_standardVP());
		ok().click();
		
		//exit to allow another iteration
		// Frame: PSM Login
		psmLogin(ANY,MAY_EXIT).maximize();
	}
}

