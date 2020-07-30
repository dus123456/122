package defcult2;

public class Text13 {

	public static void main(String[] args) {
		int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
            sum += i;
        }
        System.out.println("1到100之间的奇数和为" + sum);

	}

}
