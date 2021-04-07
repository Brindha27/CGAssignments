
public class secondSmallest {
	int smallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp=arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr[1];
	}

	public static void main(String[] args) {
		int[] arr= {5,6,3,1,8,2};
		secondSmallest sec=new secondSmallest();
		System.out.println(sec.smallest(arr));
		// TODO Auto-generated method stub

	}

}
