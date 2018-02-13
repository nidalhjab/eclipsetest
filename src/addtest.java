package calc;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*
;public class addtest {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		model temp=new model();
		temp.add(5, 5);
		int x=temp.getresult();
		assertEquals(10,x,0);
		
	}

}
