
public class Solution {

	public static void main(String[] args) {
		int[] input = {1,2,4};
		int result = 0;
		result = solution(input);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		
		int[] valueAsPosition = new int[A.length + 1];
		
		for(int i=0; i<A.length; i++) {
			
			if (A[i] <= A.length)
				valueAsPosition[A[i]]++;
		
		}
		
		for(int j=1; j<=A.length;j++) {
			if (valueAsPosition[j] == 0) return 0;
		}
		
		return 1;
	}
		
}


