package defcult2;

public class Text11 {

	public static void main(String[] args) {
		//4%��Ϣ 10000��3��
         double sum = 10000;
         int i = 0;
         while(i<3)
         {
        	 sum*=(1+0.04);
        	 i++;
         }
         System.out.println(sum);
	} 

}
