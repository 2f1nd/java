package ��̸�ϰ;
/*1�� ����һ���������飬������ֵ 61, 23, 4, 74, 13, 148, 20

2�� ��������ֱ𱣴����ֵ����Сֵ���ۼ�ֵ��ƽ��ֵ�������������еĵ�һ��Ԫ�ؼ�Ϊ���ֵ��Ϊ��Сֵ

3�� ʹ�� for ѭ�����������е�Ԫ�أ��ֱ���ٶ������ֵ����Сֵ�Ƚϡ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ������ȼٶ�����СֵҪС�����滻��ǰ����Сֵ

4�� ѭ��ִ�й����ж������е�Ԫ�ؽ����ۼ����

5�� ѭ�����������ۼ�ֵ����ƽ��ֵ������ӡ����������*/
public class demo2 {
	public static void main(String[] args) {
		int nums[]=new int[]{61, 23, 4, 74, 13, 148, 20};//����
		int max=nums[0];//���������һλΪ���ֵ
		int min=nums[0];//���������һλΪ��Сֵ
		int sum=0;//������Ϊ0
		double avg=0;//ƽ����Ϊ��������
		for(int i=0;i<nums.length;i++) {//���� ��nums[1]��ʼ��23��
			if(nums[i]>max) {//���nums[i]>max,���滻max
				max=nums[i];
			}
			if(nums[i]<min) {//���nums[i]<min,���滻min
				min=nums[i];
			}
			sum=sum+nums[i];//���
		}
		avg=sum/nums.length;//��ƽ����
		System.out.println("���ֵΪ"+max);
		System.out.println("��СֵΪ"+min);
		System.out.println("����Ϊ"+sum);
		System.out.println("ƽ��ֵΪ"+avg);
	}
}
