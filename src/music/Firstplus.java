package music;
import java.util.Scanner;//����Scanner
/*��дjava���򣬽��������༶��4λѧ���ɼ�������ƽ����
 *�õ�����ѭ��
 *�����ư༶���ڲ���Ƹ�ѧ���ɼ� */
public class Firstplus {
	public static void main(String[] args) {
		int classNum=3;//�༶����
		int stuNum=4;//ѧ������
		double sum=0;//����ɼ���
		double avg=0;//�ɼ�ƽ����
		Scanner input=new Scanner(System.in);//����scanner����
		for(int i=1;i<=classNum;i++) {//���ѭ�����ư༶��
			sum=0;
			System.out.println("***�������"+i+"���༶�ɼ�***");
			int j=1;
			while(j<=stuNum) {//�ڲ�ѭ������ѧ����
				System.out.println("�������"+j+"��ͬѧ�ɼ�");
				double score=input.nextInt();//��ȡѧ���ɼ�
				sum=sum+score;//��óɼ��ܺ�
				j+=1;
			}
			avg=sum/stuNum;//��ƽ����
			System.out.println("ƽ����Ϊ"+avg);
		}
		
	}
}
