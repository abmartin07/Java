import java.util.Arrays;
public class LearnArrays {

	public static void main(String[] args) {
	
	String a[]={"bony","tony","fony","suny","buny"};
	int[] i = new int[10];
	i[0]=1;
	i[1]=8;
	i[2]=9;
	i[3]=5;
	i[4]=5;
	i[5]=6;
	i[6]=7;
	i[7]=2;
	i[8]=3;
	i[9]=7;
		//System.out.println(a.length);
	//for(int c=0; c<a.length;c++){
		//System.out.println(a[c]);
	//}
	//for(int b=0; b<i.length; b++){
		//System.out.print(Arrays.toString(a));
		
	
	System.out.print(Arrays.toString(i));
	}
	//System.out.println(a.length);
}
//}

/*public static void main(String[] args) {
    int[] intArray = new int[] {1, 2, 3, 4, 5};
    String[] strArray = new String[] {"John", "Mary", "Bob"};

    //Prior to Java 8
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(strArray));

    // In Java 8 we have lambda expressions
    Arrays.stream(intArray).forEach(System.out::println);
    Arrays.stream(strArray).forEach(System.out::println);
}
}*/

