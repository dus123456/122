
public class Text4 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 0-9: 十进制48
		 * A-Z:十进制65
		 * a-z:十进制97
		 */
		
	 
		char a = 'a';
		char b = 'b';
		char c = '\u03A6';
		char d = '\t';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
       
        	    System.out.println("escape\\bchar");
        	    System.out.println("escape\\tchar");
        	    System.out.println("escape\\rchar");
        	    System.out.println("escape\\nchar");
        	    System.out.println("\\我在斜线里\\");
        	    System.out.println("\'我在单引号里\'");        	    
        	    System.out.println("\"我在双引号里\"");
        	    System.out.println("我没有双引号");
        	
        	boolean flag = true;
	}

}
