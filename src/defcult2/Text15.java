package defcult2;

public class Text15 {

	public static void main(String[] args) {
		//判断一个数是不是质数(素数)，除了1和本身之后，不能被其他数整除
       int n = 19;
       for(int  i=2 ; i< n ; i++)
       {
    	   if(n%i==0)
    	   {
    		   System.out.println("不是素数");
    		   return;
    	   }
       }
       System.out.println("是素数");
	}

}
