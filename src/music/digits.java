package music;

public class digits {				//���� num ��λ��
	public static void main(String[] args) {
		int num=99999;
		int count=0;
		if(num>=0&&num<=999999999) {
			while(num!=0) {
				count++;
				num/=10;	
			}
			System.out.println("����"+count+"λ��");
		}else {
			System.out.println("��������");
		}
	}
}
