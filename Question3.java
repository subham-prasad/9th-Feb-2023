package thursdayquestion0902;

public class Question3 {

	public static void main(String[] args) {
		table();
	}
	static void table() {
	String[] name = {"Amy","Boyd","Cathy","John","Peter"};
		
		int[] value = {9,10,12,14,15};
		
		System.out.println("Name \tValues");
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"\t"+value[i]);
		}
	}
}
