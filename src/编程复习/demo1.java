package 编程复习;
/*程序功能：
 * 输入3个班级，每个班级各4位同学的成绩
 * 分别求班级平均分
 */

import java.util.Scanner;//导入Scanner

public class demo1 {
	public static void main(String[] args) {
		int classNum=3;//班级数
		int stuNum=4;//学生数
		double sum=0;//总数
		double avg=0;//平均数
		for(int i=1;i<=classNum;i++) {//外层循环控制班级数
			sum=0;
			System.out.println("***请输入第"+i+"个班级成绩***");
			for(int j=1;j<=stuNum;j++) {//内层循环控制学生数
				System.out.println("请输入第"+j+"位同学成绩");
				Scanner input=new Scanner(System.in);//获取学生成绩
				double score=input.nextDouble();//将成绩赋值给score
				sum=sum+score;//计算总和
			}
			avg=sum/classNum;//计算平均值
			System.out.println("第"+i+"个班级平均分为:"+avg);
		}
	}
}
