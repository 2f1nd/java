package music;
import java.util.Scanner;
/*��ĳ��������60Ϊֹ
 * �������Ĵ���
 * 
 * */
public class digit_plus {		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//����Scanner����
		System.out.print("�����뿼�Գɼ���");
		int score=input.nextInt();//��ȡ�û��ɼ���������score��
		int count=0;
		System.out.println("����ǰ����Ϊ "+score);
		if(score>60) {
			while(score>60) {
				score-=1;
				count++;
			}
			System.out.println("���ֺ����Ϊ "+score);
			System.out.println("������ "+count+" ��");
		}else {
			System.out.println("û�ü� ");
		}
	}
}
