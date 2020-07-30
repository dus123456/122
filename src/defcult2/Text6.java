package defcult2;

public class Text6 {

	public static void main(String[] args) {
		int month = 10;
	     //1,3,5,7,8,10,12  ->31
		//4,6,9,11 ->30
		//
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			System.out.println("28天");
			break;
			default:
				System.out.println("输入不合法");
				break;
		}
	}

}
