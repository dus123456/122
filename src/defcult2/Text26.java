package defcult2;

public class Text26 {

	public static void main(String[] args) {
		for(int i= 0; i<=33;i++){
			
			for(int j=0; j<=25; j++){
				
				int k=100-i-j;
				if(i*3+j*4+k*0.5 ==100){
					System.out.println("母鸡的购买数量 :" + i+ "公鸡的购买数量 :" + j + "小鸡的购买数量" + k);
				}
			}
		}

	}

}
