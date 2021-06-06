package mainapp;

import methods.Operations;

public class Test {

	
	public static void main(String[] args) {
		
		Operations  o = new Operations();
				
		System.out.println(o.add(5, 6, 7));	
		System.out.println(o.mul(5, 6, 7));		
				
		o.setA(7);
		o.setB(9);
		o.setC(6);
		
		System.out.println(o.add());
	}
}
