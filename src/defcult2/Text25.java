package defcult2;

public class Text25 {

	public static void main(String[] args) {
		//ˮ�ɻ�������� 153= 1^3+3^3+5^3
		for (int i = 100; i < 1000; i++) {      // ѭ��������λ��
            int a = i % 10; // ���λ
            int b = (i / 10) % 10; // ��ʮλ
            int c = i / 100; // ���λ
        
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }

	}

}
