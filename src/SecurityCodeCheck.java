
public class SecurityCodeCheck {
	
	private static Integer securityCode = 9999;
	
	public Integer getSecurityCode() {
		return securityCode;
	}
	
	public Boolean isSecurityCodeCorrect(Integer securityCode) {
		if(securityCode.equals(securityCode)) {
			return true;
		} 
		System.out.println("Security Code Incorrect");
		return false;
	}
}
