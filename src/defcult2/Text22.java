package defcult2;

public class Text22 {

	public static void main(String[] args) {
		label1: for (int i = 0; i < 10; i++)
		{
            System.out.print("\n");
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(j + " ");
                if (j == 5) {
                    continue label1;
                }
            }
        }

	}

}
