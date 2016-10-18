package com.br.pereira.main;

public class ZigZag {

	static int []sequence = null;//1 <= N >= 50 elementos 
	static int longestSequence = 1;
	
	public static void fillSequence(int[] n){// onde N pode ter valores de 1 <= N >= 1000
		sequence = n;
	}
	
	public static void longestSquence(){
		int upLongest = 0;
		int downLongest = 0;
		
		if(isEmpty()){
			for(int i = 1; i< sequence.length; i++){
				upLongest=i;
				downLongest=i;
				
				for(int j = i-1; j<i; j++ ){
					if(sequence[i]>sequence[j]){
						upLongest = Math.max(downLongest+1, upLongest);
					}
					
					if(sequence[i]<sequence[j]){
						downLongest = Math.max(upLongest+1, downLongest);
					}
				}
				
				int bestLength = Math.max(upLongest, downLongest);
				longestSequence = Math.max(longestSequence,bestLength);
			} 
		}
	}
	
	private static boolean isEmpty(){
		return(sequence!=null && sequence.length>0)?true:false;
	}
	
}
