/**
 * 
 * @author aojea
 * 
 * Facade is a structural design pattern that provides a simplified 
 * (but limited) interface to a complex system of classes, 
 * library or framework. 
 * While Facade decreases the overall complexity of the application, 
 * it also helps to move unwanted dependencies to one place. 
 *
 */
public class BankAccountFacadeMain {

	public static void main(String[] args) {
		final Integer securityCode = 9999;
		final Integer accountNumber = 123;
	
		BankAccountFacade accessBanking = new BankAccountFacade(securityCode, accountNumber);
		accessBanking.withdrawCash(50.00);
		accessBanking.withdrawCash(900);
		accessBanking.depositCash(50.00);
		
		accessBanking.getBalance();
	}

}
