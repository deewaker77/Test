class BOX{
	double l;
	double b;
	double h;
	BOX(int k){
		l = k; 
		b = 10;
		h = 5;
	}
}
class ABCD{
	public static void main(String[] args){
		BOX b1 = new BOX(10);
		
		double vol;
		b1.h = 10;
		vol = b1.l*b1.b*b1.h;
		System.out.println("Box1 = " + vol);	
	}
}