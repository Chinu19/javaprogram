package variable_method;
public class VariableEmp {
        String empid;
        String empname;
        int salary;
        static String cmpname;
        public void set1(String empid, String empname,int salary)
         {
    	  this.empid=empid;
    	  this.empname=empname;
    	  this.salary=salary;
    	  }
      public void set2(String empid1, String empname1,int salary1)
      {
    	  empid=empid1;
    	  empname=empname1;
    	  salary=salary1;
    	  }
    public static void setCmpname(String cmpname) {
			VariableEmp.cmpname = cmpname;
		}
    public static void main(String[] args) {
		VariableEmp.cmpname="TCS";
    VariableEmp obj1= new VariableEmp();
    VariableEmp obj2= new VariableEmp();
   obj1.set1("Raj12", "Raj", 40000);
   System.out.println(obj1.empid+" "+obj1.empname+" "+obj1.salary);
   obj2.set2("Raju12", "Raju", 50000);
   System.out.println(obj2.empid+" "+obj2.empname+" "+obj2.salary);
  
}

}
