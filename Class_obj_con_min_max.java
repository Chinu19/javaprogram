package java_practicals;

public class Class_obj_con_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    min_max();
	}
	public static void min_max() {
		Constructor obj=new Constructor();
	 int min ,max;
	System.out.println("Enter a minimum number:");
	min=obj.sc.nextInt();
	System.out.println("Enter a maximum number:");
	max=obj.sc.nextInt();
	Constructor obj1=new Constructor(min,max);
	}
}
