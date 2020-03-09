package com.sici;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Sici
{
   
	public Sici()
	{
	PrintStream printStream=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner sc=new Scanner(System.in);
	Double principle_amount,rate,time,simple_interest,compund_interest;
	printStream.print("Calculating Simple and Compund Interest\n");
	printStream.print("Enter the principle Amount\n");
	principle_amount=sc.nextDouble();
	
	printStream.print("Enter the Time\n");
    time=sc.nextDouble();
	
    printStream.print("Enter the Rate\n");
    rate=sc.nextDouble();
    
    simple_interest=((principle_amount*time*rate)/100);
    
    printStream.print("simple interest ="+simple_interest+"\n");
    
    compund_interest=principle_amount*(Math.pow((1+rate/100),time));
    
    printStream.print("compound interest="+compund_interest+"\n");
    
    System.exit(0);
	}
	
}
