package com.nt.source;

//Arithmetic app

public class Arithmetic{
	public int add(int a, int b){
		return a+b;
	}
	public static void main(String args[]){
		Arithmetic ar=new Arithmetic()
		System.out.println("Sum is: "+ar.add(10,25));
	}
}