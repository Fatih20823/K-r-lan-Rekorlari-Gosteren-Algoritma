package com.RekorK;

public class Main {

	public static void main(String[] args) {
		double [] scores = new double [] {10,12,11.5,13,9,11,8.9,8.8};
		int recores=0;		
        for (int i = 0; i < scores.length; i++) {
			boolean value=true;
			for(int j=0;j<i;j++) {
				if(scores[j]<scores[i]) {
					value=false;
					break;
				}				
			}
			if(value) {
				recores++;
			}
		}
        System.out.println("recores: "+recores);
	}

}
