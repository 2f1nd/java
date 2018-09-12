package music;
import java.util.Scanner;//导入Scanner
/*编写java程序，接收三个班级各4位学生成绩并计算平均分
 *用到二层循环
 *外层控制班级，内层控制各学生成绩 */
public class Firstplus {
	public static void main(String[] args) {
		int classNum=3;//班级数量
		int stuNum=4;//学生数量
		double sum=0;//计算成绩和
		double avg=0;//成绩平均分
		Scanner input=new Scanner(System.in);//创建scanner对象
		for(int i=1;i<=classNum;i++) {//外层循环控制班级数
			sum=0;
			System.out.println("***请输入第"+i+"个班级成绩***");
			int j=1;
			while(j<=stuNum) {//内层循环控制学生数
				System.out.println("请输入第"+j+"个同学成绩");
				double score=input.nextInt();//获取学生成绩
				sum=sum+score;//获得成绩总和
				j+=1;
			}
			avg=sum/stuNum;//求平均分
			System.out.println("平均分为"+avg);
		}
		
	}
}
