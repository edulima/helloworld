package app;
import java.io.*;

public class ExcepTest {

	public static void main(String args[]){
	      try{
	         String a[] = new String[6];
	         a[3] = "I am element 3";
	         System.out.println("Access element three :" + a[7]);
	      }catch(ArrayIndexOutOfBoundsException e){
	          e.printStackTrace();
	      } finally {
	    	  System.out.println("asdfads");
	      }
	      
	      System.out.println("Out of the block");
	      
	   }
	}

