package oops;

public class RunnerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Employee E1 = new Employee();
		
		E1.Name = "mike";
		E1.EmpId = 1000;
		E1.Department = "Hr";
		E1.Display();

		Employee E2 = new Employee("JACK",1001,"FINANCE");
		E2.Display();
		
		Bank B = new  Bank();
		B.DisplayBalance();
		int Bal = B.GetBAlance();
				
		System.out.println("the balance is " + B.GetBAlance());
		System.out.println("the balance is " + Bal);
		
		BOABank B1 = new BOABank();
		B1.DisplayBalance();
		B1.AccountNumber = 100;
		
		// overloading example
        OverLoadingExample obj = new OverLoadingExample();
        int ReqArea = obj.GetArea(3, 4);
        int SqArea = obj.GetArea(4);

        //overriding example
        
        B1.CloseAccount(123456);
        B.CloseAccount(123456);
        
        Chrome ch  = new Chrome();
        ch.OpenBrowser();
        
        Browser Br = new Chrome();
        
        Br.OpenBrowser();
        Br.CloseBrowser();
        Br.DisplayName();
        
        HondaCar car1 = new HondaCar();
        
        Interferance car2 = new HondaCar();
        
        Encapsulation En = new Encapsulation();
        
        En.setBalance(3000);
        
        System.out.println(En.getBalance());
        
        
        

	}

}
