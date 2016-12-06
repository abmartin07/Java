package TestPack;

 public class TestClass {
	
		private static int x;//private variables
		private static int y;
		
		public TestClass(){//Default Constructor
			x=5;
			y=5;
		}
		
		public TestClass(int num1,int num2){ //Parameterized Constructor
			x=num1;
			y=num2;
		}
		
		public int getX(){ //Get and Set methods
			return x;	
		}
		public void setX(int x){
			this.x = x;
		}
		public int getY(){
			return y;
		}
		public void setY(int y){
			this.y = y;
		}
			//calling method with void and no return
		public void name(){
		System.out.println("name() : Called without a return");
		}
		
			//calling method with parameters and void
		public static void Mult(int a, int b){
		System.out.println(a*b+" : Called with no return but with parameters");
		}
			
		//calling method with return type and parameter
		public static int addnums(int a,int b){
			return a+b;
		}
		
			//Method Overloading
		
		public void met(char c){
			System.out.println(c);
		}
		public void met(int c){
			System.out.println(c);
		}
		
			//Method Overriding
		static class Animal extends TestClass{
			public void name(){
				super.name();
				System.out.println("Method Overrided");
			}
			
		}
		
		public static void main(String[] args) {
			TestClass t = new TestClass(); //creating object
			System.out.println("Default value of x is "+x);
			System.out.println("Default value of y is "+y);
		
			TestClass t2 = new TestClass(11,10);
			System.out.println("Value of x after constructor overloading: "+x);
			System.out.println("Value of y after constructor overloading: "+y);
				
				//Calling the methods
			System.out.println(t.addnums(5, 5));
			t.Mult(7, 9);
			t.name();				
			
				//Method Overriding
			TestClass t3 = new Animal();
			t3.name(); //prints the output from the extended animal class which overrides the original TestClass
		
		}
	}
 
 	
