import java.util.Scanner;
class scan{
	public static void main(String[] args){
	Scanner a1 = new Scanner(System.in);
	Scanner b1 = new Scanner(System.in);
	System.out.println("Enter two numbers:" );
	int a = a1.nextInt();
	int b = b1.nextInt();
	int c = a + b;
	System.out.println("Sum: " + c);
}
}