package oops;

public class Bank {
	
	 int AccountNum;
		
		public void DisplayBalance() {
			System.out.println("Inside Display Balance");
		}

		public int GetBAlance() {
			return 100;
			
		}
			
		
		public void CloseAccount(int AccountNum) {
			System.out.println("Inside Bank CloseAccount");
		}

}
