package practice1;
import java.util.Arrays;

public class squareNSort {

		public static void main(String [] args){

		 	int [] input ={ -4,-2,0,1,3};
			int [] res = squareAndsort (input);

		   	System.out.println(Arrays.toString(res));
		}

		public static int[] squareAndsort(int [] arr){
			int [] square = new int[arr.length];

			for (int i=0; i<arr.length; i++){
			square [i] = arr[i]*arr[i];
			}
			Arrays.sort(square);
			return square;
		}		
}


