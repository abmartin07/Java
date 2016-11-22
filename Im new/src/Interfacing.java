
public class Interfacing {

	interface dogs{
		public void bark();
		public void poop();
	}
	
	public class Animals implements dogs{

		public void bark() {
			System.out.println("Dogs bark");
			
		}

		public void poop() {
			System.out.println("Dogs poop");		
		}
		
	}
	
	public static void main(String[]args){

	dogs n = new Animals();
	n.bark();
	n.poop();
	
	
	}
	}
	
	

