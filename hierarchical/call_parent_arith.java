package Heirarchical;

public class call_parent_arith extends Arithmetic_parent
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_child obj=new Addition_child();
		obj.add();
		Subtraction_child obj1=new Subtraction_child();
		obj1.sub();
		Multiplication_child obj2=new Multiplication_child();
		obj2.mul();
		division_child obj3=new division_child();
		obj3.div();
		modulus_child obj4=new modulus_child();
		obj4.mod();
	}

}
