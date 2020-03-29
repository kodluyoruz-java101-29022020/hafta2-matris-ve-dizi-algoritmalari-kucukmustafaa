package odev2;

public class soru2 
{
	public static void main(String[] args)
	{
		int[][] matrix = { 
				{ 1,  2,  3,  4, 5 },
				{ 16, 17, 18, 19, 6 }, 
				{ 15, 24, 25, 20, 7 }, 
				{ 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 }};

		
		int[] my_array=new int[matrix.length*matrix[0].length];
		
		int m = matrix.length;
		int n = matrix[0].length;
		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = m - 1;
		int index=0;
		
		while ((bottom >= top) && (right >= left)) 
		{
			for (int j = left; j <= right; j++) {
				my_array[index]=matrix[top][j];
				index++;
			}

			top++;

			for (int i = top; i <= bottom; i++) {
				my_array[index]=matrix[i][right];
				index++;
			}

			right--;

			for (int j = right; j >= left; j--) {
				my_array[index]=matrix[bottom][j];
				index++;

			}

			bottom--;

			for (int i = bottom; i >= top; i--) {
				my_array[index]=matrix[i][left];
				index++;
			}

			left++;

		}
		
		System.out.println();
		
		for (int i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i]);
			System.out.print(" ");
		}
		
		
		
	}	
}
