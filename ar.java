public class ar {
	public static void main(String args[]){
	String s = "";
	int a[] = {1, 2, 3};
	
	for(int i : a){
	s = s.concat(String.valueOf(i));
	}
	System.out.println(s);
	}
}