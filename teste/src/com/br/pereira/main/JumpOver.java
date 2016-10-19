package com.br.pereira.main;

import java.util.List;

public class JumpOver {

	/*
	 * 1 < N >1000 if 0 return -1 Position starts in 1
	 */

	/*
	 * i = 1; count = 0; while n.size >i i +=n[i]; count++;
	 */

	public static int jump_over_numbers(List<Integer> list) {
		int index = 0;
		int jumps = 0;
		if (!isEmpty(list)) {
			while (list.size() > index) {
				jumps++;
				if (list.get(index) == 0) {
					return -1;
				}
				index += list.get(index);
			}
			return jumps;
		}

		return -1;
	}

	private static boolean isEmpty(List<Integer> list) {
		return (list.isEmpty() && list.size() < 0);
	}
}
