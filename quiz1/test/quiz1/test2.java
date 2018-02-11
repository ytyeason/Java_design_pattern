package quiz1;

import static org.junit.Assert.*;

import org.junit.Test;

import quiz1.Employee.hey;

public class test2 {

	
	@Test
	public void testEmployee(){
		hey ab = hey.a;
		assertEquals("p",Employee.getName());
		assertEquals(ab,hey.a);
	}


}
