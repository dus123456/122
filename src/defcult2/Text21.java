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
				//System.out.println("��������");
				break;
			}
		}
       if(flag)//һ����û����
       {
    	   //System.out.println("������");
    	   System.out.println(num);
    	   break;
       }
	}
	}
}
