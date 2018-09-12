package music;
import java.util.Scanner;
/*将某个数减到60为止
 * 计算它的次数
 * 
 * */
public class digit_plus {		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//创建Scanner对象；
		System.out.print("请输入考试成绩：");
		int score=input.nextInt();//获取用户成绩并保存在score中
		int count=0;
		System.out.println("减分前分数为 "+score);
		if(score>60) {
			while(score>60) {
				score-=1;
				count++;
			}
			System.out.println("减分后分数为 "+score);
			System.out.println("共减了 "+count+" 次");
		}else {
			System.out.println("没得减 ");
		}
	}
}
