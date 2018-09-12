package music;

public class Statementfor {                           //计算0~50(不含50)内偶数之和
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum%12==0) {
			System.out.println("可以被12整除");
		}else {
			System.out.println("不能被12整除");
		}
	}
}
