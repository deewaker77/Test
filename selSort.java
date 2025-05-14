import java.util.Scanner;
class selSort{
	public static void main(String args[]){
	int arr[] = new int[5];
	int i, j;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter 5 numbers: ");
	for(int i=0; i<arr.length; i++){
	arr[i] = s.nextInt();
	}
	for(i=0; i<arr.length; i++){
	for(j=i+1; i<arr.length; j++){
		if(arr[i]>arr[j]){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	}
	for(int i=0; i<arr.length; i++){
	System.out.print("Sorted numbers: " + arr[i]);
	}
	}
}