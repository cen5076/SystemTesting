
import resources.PSM001_Login_CancelHelper;
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
public class PSM001_Login_Cancel extends PSM001_Login_CancelHelper
{
	/**
	 * Script Name   : <b>PSM001_Login_Cancel</b>
	 * Generated     : <b>Nov 11, 2012 2:51:28 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/11
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		//start program
		startApp("psm");
		
		// Frame: PSM Login
		username().click(atPoint(37,9));
		psmLogin().inputChars("cen5076");
		password().click(atPoint(40,3));
		psmLogin().inputChars("cen5076");
		//click cancel button before logging in
		cancel(ANY,MAY_EXIT).click();
	}
}

