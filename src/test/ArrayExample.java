package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {10,20,30,40,50,60};
		System.out.println("total numbers are " + array1.length);
		System.out.println("the second num is " + array1[1]);
		System.out.println("the last num is " + array1[array1.length -1]);
		
	    String[]  array2 = {"abc","pqr","xyz"};
	    System.out.println("the second value is " + array2[1]);
	    
	    String str1 = "clean world green world";
	    
	    String[] array3 = str1.split(" ") ;  // {"clean","world","green","world"}
	    	
	    System.out.println("the first word is " + array3[0]);	
	}
	}


