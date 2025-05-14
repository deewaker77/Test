public class Intose {
	public static void main(String args[]){
	String s = "";
	int a[] = {1, 2, 9};
	
	for(int i : a){
		s = s.concat(String.valueOf(i));
	}
	System.out.println(s);

	int p = Integer.parseInt(s) + 1;
	System.out.println(p);
	}
}