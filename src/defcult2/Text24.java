package defcult2;

public class Text24 {

	public static void main(String[] args) {
		 int n = 9;
	        int m = 12;
	        int result = n > m ? m : n;
	        for (int i = result; i >= 1; i--)
	        {
	            if ((n % i == 0) && (m % i == 0)) 
	            {
	                result = i;
	                break; // ����ѭ��
	            }
	        }
	        System.out.println(m+"��"+n+"�����Լ�� :"+result);
	}

}
