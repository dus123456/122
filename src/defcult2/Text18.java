package defcult2;

public class Text18 {

	public static void main(String[] args) {
		int i, sum=0;
        for ( i = 1; i < 101; i++)
        {
            sum += i;
            if (sum >= 6666) {
                break;
            }
        }
        System.out.println("从1到" + i + "的和为" + sum);

	}

}
