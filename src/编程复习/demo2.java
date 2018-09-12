package 编程复习;
/*1、 定义一个整型数组，并赋初值 61, 23, 4, 74, 13, 148, 20

2、 定义变量分别保存最大值、最小值、累加值和平均值，并假设数组中的第一个元素既为最大值又为最小值

3、 使用 for 循环遍历数组中的元素，分别与假定的最大值和最小值比较。如果比假定的最大值要大，则替换当前的最大值；如果比假定的最小值要小，则替换当前的最小值

4、 循环执行过程中对数组中的元素进行累加求和

5、 循环结束根据累加值计算平均值，并打印输出相关内容*/
public class demo2 {
	public static void main(String[] args) {
		int nums[]=new int[]{61, 23, 4, 74, 13, 148, 20};//数组
		int max=nums[0];//价设数组第一位为最大值
		int min=nums[0];//价设数组第一位为最小值
		int sum=0;//设总数为0
		double avg=0;//平均数为浮点类型
		for(int i=0;i<nums.length;i++) {//遍历 从nums[1]开始（23）
			if(nums[i]>max) {//如果nums[i]>max,则替换max
				max=nums[i];
			}
			if(nums[i]<min) {//如果nums[i]<min,则替换min
				min=nums[i];
			}
			sum=sum+nums[i];//求和
		}
		avg=sum/nums.length;//求平均数
		System.out.println("最大值为"+max);
		System.out.println("最小值为"+min);
		System.out.println("总数为"+sum);
		System.out.println("平均值为"+avg);
	}
}
