
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CrookedDie1Test
{

	@Test
	void getLastRollTest()
	{
		CrookedDie1 die = new CrookedDie1();
		int rollVal = die.getLastRoll();
		assertEquals("The first roll did not equal 3", 3, rollVal);
	}
	
	@Test
	void staticTestInheritanceTest()
	{
		Die die = new CrookedDie1();
		assertEquals("The testStatic method did not come from the Die class", "Die.testStatic() ", die.testStatic());
	}
	
	@Test
	void toStringInheritanceTest()
	{
		Die die = new CrookedDie1();
		assertEquals("A die that is initialized as a CrookedDie didn't call the CrookedDie toString", "A CrookedDie1 always rolling 3, and... A Die object with roll " + die.getLastRoll(), die.toString());
	}
	
	@Test
	void toStringOverloadInheritanceTest()
	{
		Die die = new CrookedDie1();
		assertEquals("A CrookedDie did not use the inherited Die.toString(String) overloaded method", "123A CrookedDie1 always rolling 3, and... A Die object with roll " + die.getLastRoll(), die.toString(123));
	}

}
