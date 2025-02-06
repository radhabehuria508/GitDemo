package test;

import org.testng.annotations.Test;

public class child1 extends Super1 {

	@Test
	public void testing() {
		System.out.println("testing inheritance");
		child2 c=new child2(3);
		System.out.println(c.increment());
		System.out.println(c.decrement());
		System.out.println(c.multipleOf2());
		System.out.println(c.multipleOf3());
		
	}
	
	
}
