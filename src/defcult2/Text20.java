package defcult2;

public class Text20 {

	public static void main(String[] args) {
		//return(��������)��break(��������ѭ��)��continue(��������ѭ���������´�ѭ��)
		for (int i = 1; i < 20; i++)
		{
            if ((i % 2) == 0) {
                continue;
            }
            System.out.print(i + " ");
		}

	}

}
