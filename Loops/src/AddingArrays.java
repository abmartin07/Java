import java.util.ArrayList;
import java.util.Arrays;
public class AddingArrays {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(9);
		num.add(7);
		num.add(8);
		//for(int i=0; i<num.size(); i++){
			//int[] k= {num.get(i)};
			//System.out.print(" "+Arrays.toString(k));
		num.forEach((h)->{System.out.print(" "+h);}        );
	
	}
	}
//}