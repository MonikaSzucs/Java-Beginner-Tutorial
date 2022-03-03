package classesandobjects;

public class AccountHolderObjects {
	
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligbilityForCreditCard();
		System.out.println("Is Tom elegible for a credit card: " + tom.eligibleForCreditCard);
		
		henry.firstName = "Henry";
		henry.lastName = "Hill";
		henry.age = 31;
		henry.accountBalance = 20000;
		henry.testEligbilityForCreditCard();
		System.out.println("Is Henry elegible for a credit card: " + henry.eligibleForCreditCard);
	}
}
