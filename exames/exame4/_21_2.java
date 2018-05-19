package david.exames.exame4;

public class _21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}


interface Account{   
	public default String getId(){      
		return "0000";   
	} 
}  

interface PremiumAccount extends Account{   
	public String getId(); 

}  

class BankAccount implements PremiumAccount{   
	public static void main(String[] args) {       
		Account acct = new BankAccount();       
		System.out.println(acct.getId());   
	}  
}