package defcult2;

public class Text25 {

	public static void main(String[] args) {
		//水仙花数的求解 153= 1^3+3^3+5^3
		for (int i = 100; i < 1000; i++) {      // 循环所有三位数
            int a = i % 10; // 拆个位
            int b = (i / 10) % 10; // 拆十位
            int c = i / 100; // 拆百位
        
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }

	}

}
