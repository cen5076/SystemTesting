
import resources.Common_LoginHelper;
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
public class Common_Login extends Common_LoginHelper
{
	/**
	 * Script Name   : <b>Common_Login</b>
	 * Generated     : <b>Nov 18, 2012 12:48:32 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/18
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("psm");
		
		// Frame: PSM Login
		username().click(atPoint(13,15));
		psmLogin().inputKeys("cen5076{TAB}");
		psmLogin().inputChars("cen5076");
		psmLogin().performTest(PSMLogin_stateVP());
		login().click();
		
		// Frame: PSM Main Menu
		psmMainMenu().performTest(PSMMainMenu_stateVP());
		peterClarke().performTest(PeterClarke_standardVP());
		String PeterClarke_text = (String)peterClarke().getProperty("text");
	}
}

