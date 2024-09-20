package com.aman;

public class SecondHighest {
	
	public static void main(String [] args) {
		int[] arr= {2,4,5,3,6,7,9,4,5,6};
		int startin=2;
		int endin=6;
		//subarray
		int[] subarr=new int[endin-startin+1];
		for(int i=startin; i<=endin; i++) {
			subarr[i-startin]=arr[i];
			
		}
		//find highest and sec highest
		
		int high=Integer.MIN_VALUE;
		int sechigh=Integer.MIN_VALUE;
		for(int i=0; i<subarr.length;i++) {
			if(subarr[i]>high) {
				sechigh=high;
				high=subarr[i];
			}else if(subarr[i]>sechigh && subarr[i]!=high) {
				sechigh=subarr[i];
		}
	}
		//print sub arr
		System.out.println("Sub array:-");
		for(int num : subarr) {
			System.out.print(num +" ");
		}
		System.out.println();
		System.out.println("Sec highest:-"+ sechigh);

	}
}
