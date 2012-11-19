
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
	 * Generated     : <b>Nov 18, 2012 4:53:14 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/18
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		/*startApp("psm");
		// Data Driven Code inserted on Nov 18, 2012
		
		// Frame: PSM Login
		username().setText(dpString("Username 2"));
		// Data Driven Code inserted on Nov 18, 2012
		password().setText(dpString("Password 2"));
		*/
		
		while(!dpDone()){
			startApp("psm");
			
			// Frame: PSM Login
			psmLogin().performTest(PSMLogin_stateVP(), 1.0, 10.0);
			username().click(atPoint(36,8));
			psmLogin().inputChars(dpString("Username"));
			password().click(atPoint(103,11));
			psmLogin().inputChars(dpString("Password"));
			login().click();
			
			// Frame: System Message
			systemMessage().waitForExistence(10.0, 0.5);
			incorrectUsernamePassword().performTest(IncorrectUsernamePassword_standardVP());
			String IncorrectUsernamePassword_text = 
			   (String)incorrectUsernamePassword().getProperty("text");
			ok().click();
			
			// Frame: PSM Login
			psmLogin().waitForExistence(10.0, 0.5);
			psmLogin(ANY,MAY_EXIT).click(atPoint(253,7));
			//increment datapool
			dpNext();
		}
	
		
	}
}

