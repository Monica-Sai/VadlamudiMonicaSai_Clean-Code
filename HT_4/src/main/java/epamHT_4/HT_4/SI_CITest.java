package epamHT_4.HT_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SI_CITest {

	@Test
	public void testSimpleInterest() {
		SI_CI s=new SI_CI();
		assertEquals(1500.00,s.SimpleInterest(10000.00, 3, 5.00),0);
	}

	@Test
	public void testCompoundInterest() {
		SI_CI s=new SI_CI();
		assertEquals(1210.0000000000002,s.CompoundInterest(1000, 2, 10),0);
	}
}
