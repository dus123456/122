package defcult2;

public class Trxt23 {

	public static void main(String[] args) {
		int m = 25000;
        int n = 29000;
        int result = 1;
        for (int i = 1; i <= m; i++) 
        {
            if ((m % i == 0) && (n % i == 0)) 
            {
                result = i;
            }
        }
        System.out.println(m+"��"+n+"�����Լ�� :"+result);

	}

}
