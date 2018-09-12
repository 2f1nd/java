package music;

public class equals {
	public static void main(String[] args) {
		int a=59;
		String sex="男";
		if(a<=60) {
			if(sex.equals("男")) {				//字符比较用。equals（）
				System.out.println("男的不及格");
			}else {
				System.out.println("女生不及格");
			}
		}else {
			System.out.println("及格");
		}
	}
}
