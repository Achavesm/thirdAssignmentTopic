/**
 * 
 */
package org.escoladeltreball.thirdassignmenttopic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw39397876
 *
 */
public class IpadTest {

	Ipad ipad;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ipad = new Ipad("Apple", "Mojon turbo extra smell", 50);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ipad = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.thirdassignmenttopic.DeviceImpl#overClock()}.
	 */
	@Test
	public final void testOverClock() throws Exception {
		assertEquals(75, ipad.overClock());
		
	}

}
