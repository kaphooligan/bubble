
import java.util.Arrays;

public class bubble {

	public static void main(String[] args) {

		int test [] = {2,9,5,7,8};
		int temp;
		boolean sorted = false;
		while(sorted==false) {
			sorted=true;
			for(int i=0; i<test.length-1; i++) {
				if(test[i]>test[i+1]) {
					System.out.println(Arrays.toString(test));
					temp = test[i+1];
					test[i+1]=test[i];
					test[i]=temp;
					sorted=false;
				}
				
			}
		}
		System.out.println(Arrays.toString(test));
	}

}
