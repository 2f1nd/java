package music;

public class Statementfor {                           //����0~50(����50)��ż��֮��
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum%12==0) {
			System.out.println("���Ա�12����");
		}else {
			System.out.println("���ܱ�12����");
		}
	}
}
