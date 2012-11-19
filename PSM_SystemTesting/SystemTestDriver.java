// DO NOT EDIT: This file is automatically generated each time the script is modified.
// To modify this file either use 'Insert Java Code Snippet'or 'Insert Java Method' 
// option from simplified script.

import resources.SystemTestDriverHelper;
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

// BEGIN custom imports 		
//TODO: Add custom imports here.
// END custom imports

/**
 * Description   : Functional Test Script
 * @author David
 */
public class SystemTestDriver extends SystemTestDriverHelper
{
	/**
	 * Script Name   : <b>SystemTestDriver</b>
	 * Generated     : <b>Nov 18, 2012 1:56:22 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/18
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		

		setSimplifiedScriptLine(1); //Call  Script  PSM001_Login_Cancel  
		callScript("PSM001_Login_Cancel");
							
		setSimplifiedScriptLine(2); //Call  Script  PSM001_Login_Incorrect  =DEFAULT_ARGS    
		callScript("PSM001_Login_Incorrect",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(3); //Call  Script  PSM001_Login_Lockout  =DEFAULT_ARGS    
		callScript("PSM001_Login_Lockout",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(4); //Call  Script  PSM001_Login_Sunny  =DEFAULT_ARGS    
		callScript("PSM001_Login_Sunny",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(5); //Call  Script  PSM004_Schedule_Cancel  
		callScript("PSM004_Schedule_Cancel");
							
		setSimplifiedScriptLine(6); //Call  Script  PSM004_Schedule_Rainy  =DEFAULT_ARGS    
		callScript("PSM004_Schedule_Rainy",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(7); //Call  Script  PSM004_Schedule_Sunny  =DEFAULT_ARGS    
		callScript("PSM004_Schedule_Sunny",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(8); //Call  Script  PSM002_Logout_AfterAdd  
		callScript("PSM002_Logout_AfterAdd");
							
		setSimplifiedScriptLine(9); //Call  Script  PSM004_Schedule_Duplicate  
		callScript("PSM004_Schedule_Duplicate");
							
		setSimplifiedScriptLine(10); //Call  Script  PSM012_EditSchedule_Cancel  
		callScript("PSM012_EditSchedule_Cancel");
							
		setSimplifiedScriptLine(11); //Call  Script  PSM012_EditSchedule_Cancel2  
		callScript("PSM012_EditSchedule_Cancel2");
							
		setSimplifiedScriptLine(12); //Call  Script  PSM012_EditSchedule_Rainy  =DEFAULT_ARGS    
		callScript("PSM012_EditSchedule_Rainy",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(13); //Call  Script  PSM012_EditSchedule_RainyCourseID  
		callScript("PSM012_EditSchedule_RainyCourseID");
							
		setSimplifiedScriptLine(14); //Call  Script  PSM012_EditSchedule_Sunny  =DEFAULT_ARGS    
		callScript("PSM012_EditSchedule_Sunny",DEFAULT_ARGS,DP_SHARE_CURRENT_RECORD);
							
		setSimplifiedScriptLine(15); //Call  Script  PSM002_Logout_AfterEdit  
		callScript("PSM002_Logout_AfterEdit");
							
		setSimplifiedScriptLine(16); //Call  Script  PSM001_Login_ClearDB  
		callScript("PSM001_Login_ClearDB");
							
		setSimplifiedScriptLine(17); //Call  Script  PSM001_Login_15MinWarning  
		callScript("PSM001_Login_15MinWarning");
							
	}
}
		