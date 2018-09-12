package music;

public class digits {				//计算 num 的位数
	public static void main(String[] args) {
		int num=99999;
		int count=0;
		if(num>=0&&num<=999999999) {
			while(num!=0) {
				count++;
				num/=10;	
			}
			System.out.println("它是"+count+"位数");
		}else {
			System.out.println("输入有误");
		}
	}
}
