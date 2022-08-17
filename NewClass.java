package variable_method;

public class NewClass {
    
		public static void main(String[] args) {
			Method.companyName="Tcs";
			Method obj1=new Method(); 
			obj1.method1("137ng","Neha",60000);
			System.out.println("the data is :"+obj1.empid+" "+obj1.name+" "+obj1.salary+" "+obj1.companyName);
		   Method obj2=new Method();
	        obj2.method1("110ms","Muskan",65000);
			System.out.println("the data is :"+obj2.empid+" "+obj2.name+" "+obj2.salary+" "+obj1.companyName);
		}
}
