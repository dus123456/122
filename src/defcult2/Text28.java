package defcult2;
import java.util.	Scanner;

public class Text28 {

	public static void main(String[] args) {
		//�ֽ�����ʽ90=2*3*3*5
		int param = 120;
		for(int i= 2;i<=param;i++)
		{
			while(param!=i)
			{
				if(param%i==0)
				{
					System.out.print(i+"*");
					
					param = param/i;
				}
				else
				{
					break;					
				}
			}
		}
		System.out.print(param);
			  /* System.out.print("������һ����Ҫ�ֽ����������");

			   Scanner scanner=new Scanner(System.in);

			   int input=scanner.nextInt();//��ȡ���������

			   System.out.println();

			   System.out.print(input+"=");

			   for (int i = 2; i < input+1; i++) {             



			       while(input%i==0&&input!=i) {

			          input=input/i;

			          System.out.print(i+"*");          

			       }  

			       if(input==i){//����Ķ�����������˵������һ������

			          System.out.print(i);

			          break;

			       }         

			   }         

			   scanner.close();*/

			 

		}  
	}


