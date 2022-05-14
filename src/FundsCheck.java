
public class FundsCheck {
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdraw) {
		if(isThereEnoghtCash(cashWithdraw)) {
			cashInAccount -=cashWithdraw;
			System.out.println("Operation successfully");
			System.out.println("Funds available:" + cashInAccount);
		}
	}
	
	public void increaseCashInAccount(double cashWithdraw) {
		cashInAccount +=cashWithdraw;
		System.out.println("Operation successfully");
		System.out.println("Funds available:" + cashInAccount);
	}
	
	public Boolean isThereEnoghtCash(double cashWithdraw) {
		if(cashWithdraw >= getCashInAccount()) {
			System.out.println("You don't have enoght funds to perform this operation");
			System.out.println("Funds available:" + cashInAccount);
			return false;
		} 
		return true;
	}
}
