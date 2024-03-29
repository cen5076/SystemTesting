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
 * Script Name   : <b>PSM001_Login_Incorrect</b><br>
 * Generated     : <b>2012/11/18 5:10:27 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 18, 2012
 * @author David
 */
public abstract class PSM001_Login_IncorrectHelper extends RationalTestScript
{
	/**
	 * IncorrectUsernamePassword: with default state.
	 *		text : Incorrect username/password
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Incorrect username/password
	 * 		name : Message
	 * 		.classIndex : 0
	 */
	protected GuiTestObject incorrectUsernamePassword() 
	{
		return new GuiTestObject(
                        getMappedTestObject("incorrectUsernamePassword"));
	}
	/**
	 * IncorrectUsernamePassword: with specific test context and state.
	 *		text : Incorrect username/password
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Incorrect username/password
	 * 		name : Message
	 * 		.classIndex : 0
	 */
	protected GuiTestObject incorrectUsernamePassword(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("incorrectUsernamePassword"), anchor, flags);
	}
	
	/**
	 * Login: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Login
	 * 		.classIndex : 0
	 */
	protected GuiTestObject login() 
	{
		return new GuiTestObject(
                        getMappedTestObject("login"));
	}
	/**
	 * Login: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Login
	 * 		.classIndex : 0
	 */
	protected GuiTestObject login(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("login"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : Incorrect username/password
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : Incorrect username/password
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
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
	 * SystemMessage: with default state.
	 *		.captionText : System Message
	 * 		.class : Interface.Messages
	 * 		accessibleContext.accessibleName : System Message
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject systemMessage() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("systemMessage"));
	}
	/**
	 * SystemMessage: with specific test context and state.
	 *		.captionText : System Message
	 * 		.class : Interface.Messages
	 * 		accessibleContext.accessibleName : System Message
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject systemMessage(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("systemMessage"), anchor, flags);
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
	
	/**
	 * Locate and return the verification point IncorrectUsernamePassword_standard object in the SUT.
	 */
	protected IFtVerificationPoint IncorrectUsernamePassword_standardVP() 
	{
		return vp("IncorrectUsernamePassword_standard");
	}
	protected IFtVerificationPoint IncorrectUsernamePassword_standardVP(TestObject anchor)
	{
		return vp("IncorrectUsernamePassword_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point PSMLogin_state object in the SUT.
	 */
	protected IFtVerificationPoint PSMLogin_stateVP() 
	{
		return vp("PSMLogin_state");
	}
	protected IFtVerificationPoint PSMLogin_stateVP(TestObject anchor)
	{
		return vp("PSMLogin_state", anchor);
	}
	
	

	protected PSM001_Login_IncorrectHelper()
	{
		setScriptName("PSM001_Login_Incorrect");
	}
	
}

