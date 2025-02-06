package test;

public class child2 extends super2{
	
	int a;
	
	public child2(int a) {
		super(a);
		this.a=a;
	}
	public int increment() {
		
		a=a+1;
		return a;
	}
	public int decrement() {
		
		a=a-1;
		return a;
	}
}
