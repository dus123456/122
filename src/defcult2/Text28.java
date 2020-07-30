package defcult2;
import java.util.	Scanner;

public class Text28 {

	public static void main(String[] args) {
		//分解质因式90=2*3*3*5
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
			  /* System.out.print("请输入一个你要分解的正整数：");

			   Scanner scanner=new Scanner(System.in);

			   int input=scanner.nextInt();//获取输入的数字

			   System.out.println();

			   System.out.print(input+"=");

			   for (int i = 2; i < input+1; i++) {             



			       while(input%i==0&&input!=i) {

			          input=input/i;

			          System.out.print(i+"*");          

			       }  

			       if(input==i){//上面的都不能整除，说明这是一个质数

			          System.out.print(i);

			          break;

			       }         

			   }         

			   scanner.close();*/

			 

		}  
	}


