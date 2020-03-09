package com.epam.State_Pattern;
public class Template_Pattern 
{
	public static void main( String[] args )
	{
		System.out.println("The Offline Payment Process : \n");
		Bank offline=new Offline_Payment();
		offline.payment();
		System.out.println("\nThe Online Payment Process : \n");
		Bank online=new Online_Banking();
		online.payment();
	}
}
