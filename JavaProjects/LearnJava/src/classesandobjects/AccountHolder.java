package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	public void testEligbilityForCreditCard() {
		if(age>25 && accountBalance >=20000) {
			eligibleForCreditCard = true;
		}
	}
}
