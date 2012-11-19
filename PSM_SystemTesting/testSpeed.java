
import resources.testSpeedHelper;
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
public class testSpeed extends testSpeedHelper
{
	/**
	 * Script Name   : <b>testSpeed</b>
	 * Generated     : <b>Nov 18, 2012 6:16:00 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2012/11/18
	 * @author David
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atRow(atPath("Composers->Haydn")), atPoint(16,7));
		tree2().click(atRow(atPath("Composers->Haydn")), atPoint(15,7));
		tree2().click(atPath("Composers->Haydn->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Haydn->Symphonies Nos. 94 & 98"));
		tree2().doubleClick(atPath("Composers->Haydn->Symphonies Nos. 99 & 101"));
		album().click(atText("Details"));
		// TabbedPage
		description().click(atPoint(182,50));
		classicsCD().inputChars(" this is some extra test");
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().click(atText("Susan Flontly"));
		password().drag(atPoint(30,10), atPoint(29,9));
		memberLogon().inputChars("jhhghgh");
		memberLogon().click(atPoint(201,225));
		cancel().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

