package music;
/*����һ���������еĶ�ά���� names ����ֵ��ʹ�ö���ѭ�������ά�����е�Ԫ�ء�
 * {"tom","jack","mike"},{"zhangsan","lisi","wangwu"}
 */
public class Two_dimensional_array {
	public static void main(String[] args) {
		//��ά����
		String[][] names= {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		for(int i=0;i<names.length;i++) {//�����ά����ÿ��Ԫ��
			for(int j=0;j<names[i].length;j++) {//��λ��ά����ÿ��Ԫ��
				System.out.println(names[i][2]);
			}
			System.out.println();
		}
	}
}
