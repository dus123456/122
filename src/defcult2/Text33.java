package defcult2;

public class Text33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
        int sum = 0;
        do {
            if (i % 2 != 0)
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1到100之间的奇数和为" + sum);
	}

}
