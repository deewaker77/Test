import java.util.Scanner;
class multDArr{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int a[][][] = new int[2][2][2]; 
	int b[][][] = new int[2][2][2]; 
	int c[][][] = new int[2][2][2];
	int i, j, k;
	System.out.println("Enter first array: ");
	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			for(k=0; k<2; k++){
				a[i][j][k] = s.nextInt();
			}
		}
	}
	System.out.println();
	System.out.println("Enter second array: ");
	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			for(k=0; k<2; k++){
				b[i][j][k] = s.nextInt();
			}
		}
	}
	System.out.println();
	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			for(k=0; k<2; k++){
				c[i][j][k] = a[i][j][k] + b[i][j][k];
			}
		}
	}
	System.out.println();
	System.out.println("Sum of arrays: ");
	for(i=0; i<2; i++){
		for(j=0; j<2; j++){
			for(k=0; k<2; k++){
				System.out.print(c[i][j][k] + " ");
			} 
		} System.out.println();
	}
}
}