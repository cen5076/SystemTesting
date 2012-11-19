
import resources.PSM001_Login_LockoutHelper;
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
public class PSM001_Login_Lockout extends PSM001_Login_LockoutHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Lockout</b>
	 * Generated     : <b>Nov 11, 2012 3:09:23 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("psm");
		
		//Third Attempt locks out
		for(int i=0;i<3;i++){
			
			// Frame: PSM Login
			username().click(atPoint(86,7));
			psmLogin().inputChars(dpString("Username"));
			psmLogin().inputKeys("{TAB}");
			psmLogin().inputChars(dpString("Password"));
			login().click();
			
			// Frame: System Message
			incorrectUsernamePassword().performTest(IncorrectUsernamePassword_standardVP());
			ok().click();
		
			if(i < 2){
			// Frame: PSM Login
			psmLogin().performTest(PSMLogin_stateVP());
			}
			this.dpNext();
		}
		
		//Created Loop to execute iterations instead
		/*username().click(atPoint(65,1));
		psmLogin().inputChars("cen5076");
		password().click(atPoint(46,7));
		psmLogin().inputChars("badPassword");
		login().click();
		
		// Frame: System Message
		incorrectUsernamePassword().performTest(IncorrectUsernamePassword_standard_2VP());
		ok().click();
		
		// Frame: PSM Login
		psmLogin().performTest(PSMLogin_state_2VP());
		username().click(atPoint(85,9));
		psmLogin().inputKeys("badUser{TAB}");
		psmLogin().inputChars("badPassword");
		login().click();
		
		// Frame: System Message
		incorrectUsernamePassword().performTest(IncorrectUsernamePassword_standard_3VP());
		ok().click();
		*/
		tooManyTriesSystemExiting().performTest(TooManyTriesSystemExiting_standardVP());
		ok2(ANY,MAY_EXIT).click();
	}
}

