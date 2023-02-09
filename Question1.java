package thursdayquestion0902;
import java.util.Scanner;
public class Question1 {
//To change the character of string leaving the last 4 digits.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		change_chars(s);
		sc.close();
		  
	}
	static void change_chars(String s1) {
		int len = s1.length();
		char[] ch =new char[len];
		for(int i=0;i<len;i++) {
			ch[i]= s1.charAt(i);
		}
		for(int i=0;i<len-4;i++) {
			ch[i]= 'X';
			
		}
		s1=new String(ch);

		System.out.println(s1);
		

//		String s2= new String(ch);
	}

}
