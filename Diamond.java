import java.util.Scanner;
class Diamond{
public static void main(String args[]){
	int i, j, k, n;
	Scanner ac = new Scanner(System.in);
	System.out.print("Enter the length: ");
	n = ac.nextInt();
	if(n%2==0){
		n = n/2;
	}
	else{
		n = n/2;
		n += 1;
	}
	for(i=1; i<=n; i++){
	for(j=1; j<=n-i; j++)
	System.out.print(" ");
	for(k=1; k<=(2*i)-1; k++)
	System.out.print("*");
	System.out.println();
	}
	for(i=n-1; i>=1; i--){
	for(j=1; j<=n-i; j++)
	System.out.print(" ");
	for(k=1; k<=(2*i)-1; k++)
	System.out.print("*");
	System.out.println();
	}

	ac.close();
}
}