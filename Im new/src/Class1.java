
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 100;
		//int b = 500;
		//int c= a*b;
		//System.out.println("c"+c);
	Calculator calc = new Calculator();
	int u = calc.getMult(8, 46);
	float j= calc.getDiv(987, 2);
	int k = calc.getSum(98, 85);
	int s = calc.getSub(987,25);
	
	System.out.println(u+j-k+s);
	
	
	
	
	}
	
}
