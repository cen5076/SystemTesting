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
 * Script Name   : <b>CommonMainMenu_Exit</b><br>
 * Generated     : <b>2012/11/11 2:40:51 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 build 7601 Service Pack 1 <br>
 * 
 * @since  November 11, 2012
 * @author David
 */
public abstract class CommonMainMenu_ExitHelper extends RationalTestScript
{
	/**
	 * PSMMainMenu: with default state.
	 *		.captionText : PSM Main Menu
	 * 		.class : Interface.MainMenu
	 * 		accessibleContext.accessibleName : PSM Main Menu
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmMainMenu() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmMainMenu"));
	}
	/**
	 * PSMMainMenu: with specific test context and state.
	 *		.captionText : PSM Main Menu
	 * 		.class : Interface.MainMenu
	 * 		accessibleContext.accessibleName : PSM Main Menu
	 * 		.processName : java.exe
	 */
	protected TopLevelTestObject psmMainMenu(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("psmMainMenu"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point PSMMainMenu_Open object in the SUT.
	 */
	protected IFtVerificationPoint PSMMainMenu_OpenVP() 
	{
		return vp("PSMMainMenu_Open");
	}
	protected IFtVerificationPoint PSMMainMenu_OpenVP(TestObject anchor)
	{
		return vp("PSMMainMenu_Open", anchor);
	}
	
	

	protected CommonMainMenu_ExitHelper()
	{
		setScriptName("CommonMainMenu_Exit");
	}
	
}
