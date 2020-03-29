package odev2;

public class soru1 {
	public static void main(String[] args) {
		int[][] matris= {{1,0,1,1,1},{0,0,0,1,0},{1,1,0,0,1},{0,0,1,0,1},{1,1,0,1,1}};
		int h=matris.length ;
		for (int i = 1; i <= matris.length; i++) {
			for (int j = 1; j <= matris.length; j++) {
				if (i>=1 && i<=h-1 && j>=1 && j<=h-1) {
					for (int z = -1; z <= 1; z++) {
						matris[i][j]+=matris[i][j];
					}
				}
				//
			}
		}
	}
}
