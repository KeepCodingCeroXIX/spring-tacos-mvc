package com.lm2a;

public class Main {

	public static void main(String[] args) {
		String x = new String("Mario");
		System.out.println("Hash X1: "+x.hashCode());
		
		 x = x + " La Menza";
		System.out.println("Hash X2: "+x.hashCode());	
		

	}

}
