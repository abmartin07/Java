
public class NestedLoops {

	public static void main(String[] args) {
		//*every loop is initialized with a 0
		//Nested loops are mostly used for sorting!
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				for(int k=1;k<=5;k++){
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}	
}
