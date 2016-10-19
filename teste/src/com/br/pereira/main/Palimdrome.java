package com.br.pereira.main;

public class Palimdrome {

	public static boolean is_numeric_palindrome(long number) {
		String s = String.valueOf(number);
		StringBuilder str = new StringBuilder();

		str.append(s).reverse();

		if (str.toString().equals(s)) {
			return true;
		}

		return false;
	}

}
