import java.util.Scanner;
class pyramid{
public static void main(String args[]){
int l, b, s, n;
Scanner length = new Scanner(System.in);
System.out.print("Enter length of pyramid:");
n = length.nextInt();

for(l=1;l<=n;l++){
	for(b=1;b<=n-l;b++)
	System.out.print(" ");
	for(s=1;s<=2*l-1;s++)
	System.out.print("*");
	System.out.println("");
}
}
}