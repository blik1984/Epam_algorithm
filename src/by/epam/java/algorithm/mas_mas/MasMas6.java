/* Algorithmization
 * ������� ��������, ������� 6
 * ������������ ���������� ������� �� �������. ������� ������� ������ � ����� �������������.
 */

package by.epam.java.algorithm.mas_mas;

import java.util.Scanner;

public class MasMas6 {

	public static void main(String[] args) {

		int n;
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		System.out.println("������� ������� ������� � ���� ������� �������������� �����"); 
		n = S.nextInt();
		int[][] N = new int[n][n]; 
		
		for (int i = 0; i < n; i++) {
			if (i < (n / 2)) {
				for (int y = 0 + i; y < n - i; y++) { 
					
					N[i][y] = 1;
				}
			} else {
				for (int y = 0 + (n - i - 1); y < i + 1; y++) { 

					N[i][y] = 1;
				}
			}
		}
		/*
		 * ���������� ����� ������������� ��� �������� �������
		 */
		for (int l = 0; l < n; l++) {
			
			for (int m = 0; m < n; m++)	{
				
				System.out.print(N[l][m] + " ");
			}
			System.out.println("");
		}
	}
}