/* Algorithmization
 * ���������� �������, ������� 9
 * � ������� ����� ����� ����� �������� ����� �������������, ���� ��������� ��������� ����������� ���������� ���������� ���, ������� ������� � ���������� ��������.
 */

package by.epam.java.algorithm.mas1;

public class mas1_9 {
	
	private static int countMax = 0; 
	private static int valMin = 0;

	public static void main(String[] args) {
		
		int[] N = { 7, 5, -8, 0, 4, 5, 9, 12, -5, -1, 8, 6, 23, 95, -8, 3, 4, 5, 3, 3, 3, 5 }; 
		int[] C = { 0, 0 };
		int[] B = { 0, 0 };

		for (int i = 0; i < N.length; i++) 
		{
			C = countDub(i, N, N[i]); // ������� ���������� ������
			B = countMax(C[0], C[1]); // ���������� ������������ ���������� ������ � �������� ����� � ����������
										// ���������
		}
		System.out.println("���� ����� ����������� ����� " + B[1] + " � ���������� � ���������� = " + B[0]);
	}

	static int[] countDub(int i, int N[], int val) 
	{
		int countDub = 0;
		for (i = 0; i < N.length; i++) {
			if (N[i] == val) {
				countDub++;
			}
		}
		return new int[] { countDub, val };

	}

	static int[] countMax(int countDub, int val) { 
		
		if (countDub > countMax) {
			countMax = countDub;
			valMin = val;
			
		} else if (countMax == countDub) {
			if (val < valMin) {
				countMax = countDub;
				valMin = val;
			}
		}

		return new int[] { countMax, valMin };
	}
}
