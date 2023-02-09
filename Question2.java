package thursdayquestion0902;

public class Question2 {

	public static void main(String[] args) {
		String[] str1 = {"Hi ",null};
		String[] str2 = {"My ","name ","is "};
		String[] str3 = {"Subham ","Prasad"};
		
		concat(str1);
		concat(str2);
		concat(str3);
	}
	
	static void concat(String[] str) {
		String val = " " ;
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null)
				val=val.concat(str[i]);
		}
		System.out.println(val);
	}

}
