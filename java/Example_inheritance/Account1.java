class Account{
    String name;
    String accountNumber;
    float balance;
    string IFSC code;
}
class SavingsAccount extends Account{
    double interestRate;
	String name;
	float accountLimit;
	float creaditLimit;
	float minBalance;
}
class FdAccount extends Account{
	float ROI;
	int maturitytime;
	List<Type> types;
}