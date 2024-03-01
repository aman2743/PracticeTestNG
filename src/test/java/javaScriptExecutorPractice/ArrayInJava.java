package javaScriptExecutorPractice;

public class ArrayInJava {
	public static void main(String[] args) {
//		N = 10, S = 15
		int sum = 0;
		int count = 0;
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = A.length;
		for (int i = 0; i < n; i++) 
		{
			int a = A[i];
			sum = sum + a;
			for (int x = i + 1; x < n; x++)
			{
				count++;
				sum = sum + A[x];
				if (sum == 15) 
				{
					for (int h = 0; h <= count; h++) 
					{
						System.out.print(A[h]);
					}
				}	
			}
		}
		sum=0;
		
	}
}
