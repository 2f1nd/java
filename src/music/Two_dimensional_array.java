package music;
/*定义一个两行三列的二维数组 names 并赋值，使用二重循环输出二维数组中的元素。
 * {"tom","jack","mike"},{"zhangsan","lisi","wangwu"}
 */
public class Two_dimensional_array {
	public static void main(String[] args) {
		//二维数组
		String[][] names= {{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
		for(int i=0;i<names.length;i++) {//定义二维数组每行元素
			for(int j=0;j<names[i].length;j++) {//定位二维数组每列元素
				System.out.println(names[i][2]);
			}
			System.out.println();
		}
	}
}
