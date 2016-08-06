package org.kostya.lesson1hometaskmaven;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class PermutationsUsingGuava {
	public static int counter = 0;

	public static void orderedPermutations() {

		List<Integer> vals = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		Collection<List<Integer>> orderPerm = Collections2.orderedPermutations(vals);

		for (List<Integer> val : orderPerm) {
			int[] n = new int[val.size()];
			int i = 0;
			for (Integer e : val)
				n[i++] = e.intValue();
			if (n[0] * 1000 + n[1] * 100 + n[2] * 10 + n[3] + n[4] * 1000 + n[5] * 100 + n[0] * 10
					+ n[6] == n[7] * 10000 + n[4] * 1000 + n[8] * 100 + n[9] * 10 + n[1]) {

				counter++;
				System.out.printf("%d.%d%d%d%d+%d%d%d%d=%d%d%d%d%d%n", counter, n[0], n[1], n[2], n[3], n[4], n[5],
						n[0], n[6], n[7], n[4], n[8], n[9], n[1]);

			}

		}

	}

	public static void main(String[] args) {
		Stopwatch stopwatch = Stopwatch.createStarted();
		orderedPermutations();
		System.out.printf("Solutions number: %d%n", counter);
		System.out.println("Time used: " + stopwatch);

	}

}
