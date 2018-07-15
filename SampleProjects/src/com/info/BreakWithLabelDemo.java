package com.info;

public class BreakWithLabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayInts={{7,8,5},
		{9,63,78},{98,87,65}
		};
		int i;
		int j=0;
		int searchFor = 12;
		boolean findIt =false;
		search:
		for(i=0;i<arrayInts.length;i++){
			for( j=0;j<arrayInts[i].length;j++){
				if(arrayInts[i][j]==searchFor){
					findIt=true;
					break search ;
				}
				if(findIt){
					System.out.println("value "+searchFor+"i"+i+"j"+j);
				}
				else{
					System.out.println("invalid"+searchFor);
				}
			}
		}
		

	}

}
