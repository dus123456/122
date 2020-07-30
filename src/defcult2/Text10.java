package defcult2;

public class Text10 {

	public static void main(String[] args) {
		//1+1/2+1/3+1/4+.....+1/100
		double sum = 0;
		double i = 1;
		while(i<=100)
		{
			sum+=1/i;
			i++;
		}
		System.out.println(sum);
	}

}
