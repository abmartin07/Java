
public class twoDimensionalArrays {

	public static void main(String[] args) {
	int rows=3;
	int cols=4;
	
	int matrix[][]=new int[rows][cols];
	
	//assigning the rows 
	matrix[0][0]=15;
	matrix[0][1]=16;
	matrix[0][2]=17;
	matrix[0][3]=45;
	
	matrix[1][0]=25;
	matrix[1][1]=26;
	matrix[1][2]=27;
	matrix[1][3]=25;
	
	matrix[2][0]=35;
	matrix[2][1]=36;
	matrix[2][2]=37;
	matrix[2][3]=35;
	
	System.out.println(matrix.length);//row length
	System.out.println(matrix[0].length);//column length
	
	//print data in rectangular form
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(" "+matrix[i][j]);
			}System.out.println(" ");
		}
	
	}

}
