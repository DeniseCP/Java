package com.br.pereira.main;

public class DigitSum {

	public static Integer digit_sum(long number){
		if(number>-10 && number < 10){
			return (int) Math.abs(number);
		}
		
		Integer total = 0;
		
		String str = String.valueOf(Math.abs(number));
		
		for(int i = 0; i < str.length(); i++){
			total+= Character.digit(str.charAt(i), 10);
		}
		
		return total;
	}
	
	public static int sum(long number){
		int sum = 0;
		  if (number < 0) {
		    number *= -1;
		  }

		  while (number > 0) {
		    sum += number % 10;
		    number /= 10;
		  }

		  return sum;
		
	}
}
