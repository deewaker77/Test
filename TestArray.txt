import java.util.Scanner;
class Testarray
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int a[]=new int[5];//declaration and instantiation
for(i=0; i<a.length;i++){
a[i] = s.nextInt();
}
//traversing array
for(int i=0; i<a.length; i++)//length is the property of array
System.out.println(a[i]);
}
}