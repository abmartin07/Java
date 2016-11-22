
public class Methods {
		//calling method with return and parameter
	public static int addnums(int a,int b){
		return a+b;
	}
		//calling method with no return and parameter
	public static void Mult(int a, int b){
		System.out.println(a*b+" : Called with no return but with parameters");
	}
		//calling method with no return
	public static void name(){
		System.out.println("name() : Called without a return");
	}
		//calling with return and no parameter
	public static int nums(){
		int a=5;
		int b=6;
		return a+b;
	}
	
	public class Inheritanced extends ClassExtensionInheritance{
		int x=9;
		int y=5;
		public void inherits(){
			int z=x+y;
			yo();
			System.out.println(z);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Inheritanced.main(args);
		
		System.out.println(addnums(9,10)+" : Called with return and parameters");
		System.out.println(nums()+" : Called with a return and no parameters");
		Mult(5,6);
		name();
		
		
	
	}

}
