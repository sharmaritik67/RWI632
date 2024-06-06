package stringProgram;

public class example1 {
	public static void main(String args[]) {
		String s1 = "java";
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);
		String s3 = new String("example");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println("============================");
//		  String s="Sachin";  
//		   s=s.concat(" Tendulkar");  
//		   System.out.println(s);  
		   
		
		String a="Sachin";  
		   String b="Sachin";  
		   String c=new String("Sachin");  
		   String d="Saurav";  
		   System.out.println(a.equals(b));
		   System.out.println(b.equals(c));
		   System.out.println(a.equals(d));
		   
	}
}
