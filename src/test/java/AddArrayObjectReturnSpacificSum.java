import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayObjectReturnSpacificSum {

		public static void main(String[] args) {

			int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//			int a[] = { 9, 8, 5, 1, 3, 7, 6 };

			Arrays.sort(a);
			int sumVal = 15;

			List<Integer> arLst = new ArrayList<Integer>();
			int sum = 0;
			int it = 0;
			while (it < a.length) {
				for (int i = it; i < a.length; i++) {
					sum = sum + a[i];
					arLst.add(a[i]);
					if (sum >= 15) {
						if (sum == sumVal) {
							System.out.println(arLst);
						}
						break;
					}
				}
				it++;
				sum = 0;
				arLst.removeAll(arLst);

			}

		}

	}
