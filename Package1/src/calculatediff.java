import java.util.Scanner;

public class calculatediff {
	public static int calDiffer(int n) {
		int sum=0,d=0,su=0,t=0;
		for(int i=0;i<=n;i++) {
			sum=i*i;//375
			su+=i;//3025
		}
		/*for(int i=0;i<=n;i++) {
			su=su+i;
		}*/
		t=su*su;
		d=Math.abs(t-sum);
		return d;
	}

	public static void main(String[] args) {
		
		System.out.println(calDiffer(3));
		// TODO Auto-generated method stub

	}

}
