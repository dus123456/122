package defcult2;

public class Text7 {

	public static void main(String[] args) {
		int score = 89;
		//90-100 优秀
		//80-89 良好
		//70-79 中等
		//60-69 及格
		//60以下不及格
		//default语句功能类似于if-else语句中的else
		if(score<0||score>100)
		{
			System.out.println("输入不合法");
		       return;//结束方法
		}
		switch (score/10)
		{	
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("中等");
			break;
		case 7:
			System.out.println("良好");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("及格");
			break;
	
		
		}
	}

}
