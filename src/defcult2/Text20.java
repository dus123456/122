package defcult2;

public class Text20 {

	public static void main(String[] args) {
		//return(方法结束)，break(结束整个循环)，continue(结束本次循环，进行下次循环)
		for (int i = 1; i < 20; i++)
		{
            if ((i % 2) == 0) {
                continue;
            }
            System.out.print(i + " ");
		}

	}

}
