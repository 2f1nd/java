package music;

public class equals {
	public static void main(String[] args) {
		int a=59;
		String sex="��";
		if(a<=60) {
			if(sex.equals("��")) {				//�ַ��Ƚ��á�equals����
				System.out.println("�еĲ�����");
			}else {
				System.out.println("Ů��������");
			}
		}else {
			System.out.println("����");
		}
	}
}
