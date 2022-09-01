package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] array = {3,4,5};
		
		int num =10;
		
		try {
		//	int res = num/0;
			System.out.println(array[5]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("inside the array catch blocks");
		}finally {
			System.out.println("inside finally");
		}

		System.out.println("after excptions");
	}
	}


