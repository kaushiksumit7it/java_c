package com.demo.dynamic.binding;

class ABC{

	   public void myMethod(){

	System.out.println("Overridden Method");

	   }

	}

	public class XYZ extends ABC{

	   public void myMethod(){

			System.out.println("Overriding Method1");

	   }

	   public static void main(String args[]){

	ABC obj = new XYZ();

	obj.myMethod();

	   }

	}
