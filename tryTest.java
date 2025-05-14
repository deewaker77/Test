class tryTest{
	public static void main(String args[]){
	int a;
	try{
	a = 42/0;
	System.out.println("n/d = " + a);
	}
	catch (ArithmeticException e){
	System.out.println("Cannot divide by zero");
	}
	}
}