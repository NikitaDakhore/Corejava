package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "clean world green world";
		
		String result = "";
		
		for(int index = str.length() -1 ; index>=0;index--) {
			char ch = str.charAt(index);
			
		}
        System.out.println("the result string is " + result);
        
        int num = 456789;
        int res = 0;
        while(num>0) {
        	
        	int rem = num%10; //4
        	res = res*10 + rem;//987654
        	num = num/10; //0
        }
        System.out.println("the resulted num is " + res);
	}

	}


