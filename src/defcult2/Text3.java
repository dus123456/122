package defcult2;

public class Text3 {

	public static void main(String[] args) {
		int year =2000;
		if(year %400 ==0){
			System.out.println(year +"������");
		}
		else if (year %4 == 0 &&year %100!=0)
		{
			System.out.println(year +"��������");
		}
		else  
		{
			System.out.println(year +"������");
		}
	}

}
