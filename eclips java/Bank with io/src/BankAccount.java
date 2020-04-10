
public class BankAccount {
	
	String name ,id;
	double balance;
public	BankAccount(String name,String id,double balance) {
	this.name=name;
	this.id=id;
	this.balance=balance;
}
@Override
public String toString(){
return name+","+ id+","+balance;
}
}
