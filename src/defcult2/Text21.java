package defcult2;

public class Text21 {

	public static void main(String[] args) {
		for(int num = 200;;num++){
			
		boolean flag = true;
		for (int i=2; i<= num-1;i++)
		{
			if(num%i==0)
			{
				flag=false;
				//System.out.println("不是质数");
				break;
			}
		}
       if(flag)//一个都没整除
       {
    	   //System.out.println("是质数");
    	   System.out.println(num);
    	   break;
       }
	}
	}
}
