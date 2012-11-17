
import resources.PSM001_Login_15MinWarningHelper;
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
public class PSM001_Login_15MinWarning extends PSM001_Login_15MinWarningHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_15MinWarning</b>
	 * Generated     : <b>Nov 12, 2012 8:41:56 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/12
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("psmTimed");
		
		// Frame: PSM Login
		psmLogin().inputKeys("cen5076{TAB}");
		psmLogin().inputChars("cen5076");
		login().click();
		
		// Frame: System Message
		systemMessage().waitForExistence(70.0, 2.0);
		systemMessage().performTest(SystemMessage_stateVP());
		_15MinutesLeft().performTest(_15MinutesLeft_standardVP());
		String _15MinutesLeft_text = (String)_15MinutesLeft().getProperty("text");
		ok().click();
		systemMessage().waitForExistence(70.0, 2.0);
		systemMessage().performTest(SystemMessage_state_2VP());
		_5MinutesLeft().performTest(_5MinutesLeft_standardVP());
		String _5MinutesLeft_text = (String)_5MinutesLeft().getProperty("text");
		ok2().click();
		systemMessage().waitForExistence(70.0, 2.0);
		endOfClassReached().performTest(EndOfClassReached_textVP());
		endOfClassReached().performTest(EndOfClassReached_standardVP());
		String EndOfClassReached_text = (String)endOfClassReached().getProperty("text");
		ok3().drag();
		
		// Window: chrome.exe: Deliverable 2 - Google Drive - Google Chrome
		deliverable2GoogleDriveGoogleC().click(atPoint(427,781));
		
		// Frame: PSM Main Menu
		psmMainMenu(ANY,MAY_EXIT).close();
	}
}

