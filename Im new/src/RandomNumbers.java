
public class RandomNumbers {

	public static void main(String[] args) {
			//Type casting-->
		int i= (int)(Math.random()*20);
		System.out.println(i);

	if(i>15)
	System.out.println(i+" is greater than 15");
	else if(i<15 &&i>10)
		System.out.println(i+" is between 10 & 15");
	else
		System.out.println(i+" is less than 20");
	
	
	}

}
