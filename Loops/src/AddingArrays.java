import java.util.ArrayList;
import java.util.Arrays;
public class AddingArrays {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Hello");
		name.add("there! ");
		name.add("How you doing?");
		//for(int i=0; i<num.size(); i++){
			//int[] k= {num.get(i)};
			//System.out.print(" "+Arrays.toString(k));
		name.forEach((h)->{System.out.print(" "+h);}        );
	}
	}
//}