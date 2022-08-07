package lemon;

 class PersonDetails {
	int salary=1000, bonus=1000;
	int incSalary() {
		return bonus+salary;
	}

}

//with return type and without argument
public class Demo {
	public static void main(String[] args) {
		PersonDetails persondetail=new PersonDetails();
	//	persondetail.bonus=5000;
	//	persondetail.salary=50000;
		int finalamount=persondetail.incSalary();
	System.out.println("final amount is :"+finalamount);
	}

}
