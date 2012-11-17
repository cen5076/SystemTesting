// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>PSM001_Login_Cancel</b><br>
 * Generated     : <b>2012/11/11 2:51:52 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 11, 2012
 * @author David
 */
public abstract class PSM001_Login_CancelHelper extends RationalTestScript
{
	/**
	 * Cancel: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		.classIndex : 1
	 */
	protected GuiTestObject cancel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"));
	}
	/**
	 * Cancel: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		.classIndex : 1
	 */
	protected GuiTestObject cancel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"), anchor, flags);
	}
	
	/**
	 * Password: with default state.
	 *		.class : javax.swing.JPasswordField
	 * 		.priorLabel : Password: 
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject password() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("password"));
	}
	/**
	 * Password: with specific test context and state.
	 *		.class : javax.swing.JPasswordField
	 * 		.priorLabel : Password: 
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject password(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("password"), anchor, flags);
	}
	
	/**
	 * PSMLogin: with default state.
	 *		.captionText : PSM Login
	 * 		.class : Interface.LoginForm
	 * 		accessibleContext.accessibleName : PSM Login
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmLogin() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmLogin"));
	}
	/**
	 * PSMLogin: with specific test context and state.
	 *		.captionText : PSM Login
	 * 		.class : Interface.LoginForm
	 * 		accessibleContext.accessibleName : PSM Login
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmLogin(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmLogin"), anchor, flags);
	}
	
	/**
	 * Username: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Username:
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject username() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("username"));
	}
	/**
	 * Username: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Username:
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject username(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("username"), anchor, flags);
	}
	
	

	protected PSM001_Login_CancelHelper()
	{
		setScriptName("PSM001_Login_Cancel");
	}
	
}
