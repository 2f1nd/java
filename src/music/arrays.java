package music;
/*在编辑器中定义了一个数组 hobbies，实现使用 Arrays 类对数组进行排序并转换输出。

运行结果为： [ game , movie , sports ]*/
import java.util.Arrays;//导入Arrays
public class arrays {
	public static void main(String[] args) {
		String[] hobbies= {"game","movie","sports"};//设置数组
		Arrays.sort(hobbies);//排序
		System.out.println(Arrays.toString(hobbies));//转换成字符串并输出
	}
}
