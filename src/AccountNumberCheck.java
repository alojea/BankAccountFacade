
public class AccountNumberCheck {
	

	private static Integer accountNumber = 123;
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	public Boolean isAccountNumberCorrect(int accountNumber) {
		if(accountNumber == getAccountNumber()) {
			return true;
		} 
		System.out.println("Account number Incorrect");
		return false;
	}
}
