package ��̸�ϰ;
/*�����ܣ�
 * ����3���༶��ÿ���༶��4λͬѧ�ĳɼ�
 * �ֱ���༶ƽ����
 */

import java.util.Scanner;//����Scanner

public class demo1 {
	public static void main(String[] args) {
		int classNum=3;//�༶��
		int stuNum=4;//ѧ����
		double sum=0;//����
		double avg=0;//ƽ����
		for(int i=1;i<=classNum;i++) {//���ѭ�����ư༶��
			sum=0;
			System.out.println("***�������"+i+"���༶�ɼ�***");
			for(int j=1;j<=stuNum;j++) {//�ڲ�ѭ������ѧ����
				System.out.println("�������"+j+"λͬѧ�ɼ�");
				Scanner input=new Scanner(System.in);//��ȡѧ���ɼ�
				double score=input.nextDouble();//���ɼ���ֵ��score
				sum=sum+score;//�����ܺ�
			}
			avg=sum/classNum;//����ƽ��ֵ
			System.out.println("��"+i+"���༶ƽ����Ϊ:"+avg);
		}
	}
}
