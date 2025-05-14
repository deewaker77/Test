import java.util.Scanner;

public class strInt{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] a = new String[n];
		System.out.print("Enter the numbers: ");
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextLine();
		}
		
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum += Integer.ParseInt(a[i]);
		}
		
		System.out.println("Total Sum: " + sum);
		sc.close();
	}
}