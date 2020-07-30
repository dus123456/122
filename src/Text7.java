
public class Text7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		double c = (double)5/2;
		
		//a  + b 的和是?  =>字符串拼接
		
		System.out.println(c);
		System.out.println("a + b的和是" +(a + b) );
		System.out.println("a - b的差是" +(a-b));
		System.out.println("a * b的积是" +(a*b));
		System.out.println("a % b的和是" +(a%b));
		
		
		String str ="毛毛";
		System.out.println(str + "是班长");
		
		int money = 5000;
		System.out.println("我有"+money+ "钱");
		
		System.out.println(5/2);//2
		System.out.println(5/-2);//-2
		System.out.println(-5/2);//-2
		System.out.println(-5/-2);//2
		
		System.out.println(5%2);//1
		System.out.println(5%-2);//1
		System.out.println(-5%2);//-1
		System.out.println(-5%-2);//-1
		
		//自增. 自减
		int x = 1;
		
		//先用后加
		//x++;
		//先加后用
		//++x;
		int y = ++x;
		System.out.println(x);
		System.out.println(y);
	}

}
