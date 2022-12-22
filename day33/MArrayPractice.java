package day33;

import java.util.Arrays;

public class MArrayPractice {
   
	public static void main(String[] args) {
		int[][] numArr= {{1532,1113,1124,1134,1145},{1158,1191,1208,1225,1242},
				{1216,1174,1191,1208,1225},{1276,1262,1286,1311,1335},{1340,1338,1370,1403,1436}};
		System.out.println(Arrays.deepToString(numArr));
		
	

   for(int i=0; i<numArr.length;i++) {
	   for(int j=0; j< numArr[i].length;j++) {
   
	   int[] innerArray=numArr[i][j];
	   System.out.println(innerArray);
	   
	   for (int[] numArrTwo:numArr) {
		   for (int num:numArrTwo) {
			   System.out.println(num);
		   }
	   }
			   
   
}