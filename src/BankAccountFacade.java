
public class BankAccountFacade {
	public Integer securityCode;
	public Integer accountNumber;
	
	FundsCheck fundscheck;
	SecurityCodeCheck securityCodeCheck;
	AccountNumberCheck accountNumberCheck;
	WelcomeToBank welcomeToBank;
	
	
	
	public BankAccountFacade(Integer securityCode, Integer newAccountNumber) {
		this.securityCode = securityCode;
		this.accountNumber = newAccountNumber;
		
		welcomeToBank = new WelcomeToBank();
		accountNumberCheck = new AccountNumberCheck();
		securityCodeCheck = new SecurityCodeCheck();
		fundscheck = new FundsCheck();
	}
	
	public Integer getAccountNumber() { return accountNumber; }
	
	public Integer getSecurityCode() { return securityCode; }
	
	public void withdrawCash(double cashToGet) {
		if(accountNumberCheck.isAccountNumberCorrect(accountNumber) &&
		   fundscheck.isThereEnoghtCash(cashToGet) &&
		   securityCodeCheck.isSecurityCodeCorrect(securityCode)) {
			fundscheck.decreaseCashInAccount(cashToGet);
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Fail");
		}
	}
	
	public void depositCash(double cashToDeposit) {
		if(accountNumberCheck.isAccountNumberCorrect(accountNumber) &&
		   securityCodeCheck.isSecurityCodeCorrect(securityCode)) {
			fundscheck.increaseCashInAccount(cashToDeposit);
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Fail");
		}
	}
	
	public void getBalance() { 
		if(accountNumberCheck.isAccountNumberCorrect(accountNumber) &&
		   securityCodeCheck.isSecurityCodeCorrect(securityCode)) {
					System.out.println("Balance:" + fundscheck.getCashInAccount());
				} else {
					System.out.println("Transaction Fail");
				}
		}
}
