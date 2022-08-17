package variable_method;

public class Cons_newClass {
    
	public static void main(String[] args) {
		Constructor1.companyName="tcs";
		Constructor1 obj1=new Constructor1("137ng","Neha",100000);  
		System.out.println("the data is :"+obj1.empid+" "+obj1.name+" "+obj1.salary+" "+obj1.companyName);
		Constructor1 obj2=new Constructor1("110ms","Muskan",150000);
		System.out.println("the data is :"+obj2.empid+" "+obj2.name+" "+obj2.salary+" "+obj1.companyName);
	}
}
