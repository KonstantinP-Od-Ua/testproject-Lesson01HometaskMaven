package org.kostya.lesson1hometaskmaven;

import com.google.common.base.Stopwatch;

public class SolutionZveri {

	public static void main(String[] args) {

		Stopwatch stopwatch = Stopwatch.createStarted();

		int solNum = 0;
		int counter = 0;

		int[] a = new int[10];

		for (int i0 = 0; i0 < 10; i0++) {
			a[0] = i0;
			for (int i1 = 0; i1 < 10; i1++) {
				a[1] = i1;
				for (int i2 = 0; i2 < 10; i2++) {
					a[2] = i2;
					for (int i3 = 0; i3 < 10; i3++) {
						a[3] = i3;
						for (int i4 = 0; i4 < 10; i4++) {
							a[4] = i4;
							for (int i5 = 0; i5 < 10; i5++) {
								a[5] = i5;
								for (int i6 = 0; i6 < 10; i6++) {
									a[6] = i6;
									for (int i7 = 0; i7 < 10; i7++) {
										a[7] = i7;
										for (int i8 = 0; i8 < 10; i8++) {
											a[8] = i8;
											for (int i9 = 0; i9 < 10; i9++) {
												a[9] = i9;

												if (i0 * 1000 + i1 * 100 + i2 * 10 + i3 + i4 * 1000 + i5 * 100 + i0 * 10
														+ i6 == i7 * 10000 + i4 * 1000 + i8 * 100 + i9 * 10 + i1)

													for (int i = 0; i < 10; i++) {
														for (int j = i + 1; j < 10; j++)
															if (a[i] == a[j])
																break;
															else
																counter++;
													}
												if (counter >= 45) {

													solNum++;
													System.out.printf("%d.%d%d%d%d+%d%d%d%d=%d%d%d%d%d%n", solNum, i0,
															i1, i2, i3, i4, i5, i0, i6, i7, i4, i8, i9, i1);
												}
												counter = 0;

											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		stopwatch.stop();

		System.out.printf("Number of solutions: %d%n", solNum);
		System.out.println("Time used: " + stopwatch);

	}

}
