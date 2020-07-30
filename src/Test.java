public class Test {

	public static void main(String[] args) {
		//基本数据类型中的整型
		//byte(1个字节)，short(2个字节),   int(4个字节),   long(8个字节)
        
		//-128~127
		byte     a = 127;
		
		//-2^15 ~ 2^15-1
	    short    b=  32767;
	    
	    //2147483647
	    //-2^31 ~ 2^31 -1
	    int        c =  2147483647;
		
	    //-2^63 ~ 2^63-1
	    //对于long型数据，如果超过int范围，在后面加上L/1,建议用大写
	     long   d =  2147483647123L;
	    
	}

}
