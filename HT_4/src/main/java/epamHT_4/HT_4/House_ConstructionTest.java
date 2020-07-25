package epamHT_4.HT_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class House_ConstructionTest {

	@Test
	public void testcost() {
		House_Construction h=new House_Construction();
		assertEquals(11250.00 ,h.cost("high", "yes", 4.5),0);
				
	}

}
