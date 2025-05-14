import java.util.Scanner;
public class k {
    public static void main(String[] args) {
    int i,j,k,n;
    System.out.println("Enter the number of rows: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(k=1;k<=2*i-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
}