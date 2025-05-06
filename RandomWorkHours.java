public class StudentInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowSize =8;int colSize =5;
		System.out.println("MON\tTUE\tWED\tTHUR\tFRI");
		int[][] matrix = new int[rowSize][colSize];
		for(int row =0;row<matrix.length;row++) {
			for (int col = 0; col < matrix[row].length; col++)
				matrix[row][col] = (int) (Math.random()*8)+1;
				
		}
		int sumHours = 0;
		for(int i =0; i< matrix.length;i++) {
			for(int j =0; j< matrix[i].length;j++) {
				sumHours+=matrix[i][j];
				System.out.print(matrix[i][j]+"\t");
				
			}
				System.out.print(" Empleyee #"+i+" hours : " +sumHours);
				sumHours = 0;
				System.out.print("\n");
		}
		
		
		
	}
	
}
