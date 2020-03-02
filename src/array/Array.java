package array;

public class Array {
	public static void countMethod() {
		int[]b= {10,20,30,40,50,10,10};
		
		int count=0;
		
		/*System.out.println(length);*/
		/*System.out.println(b[0]);*/
			for (int i = 0; i < b.length; i++) {
				int length=b.length;
				
			 if(b[i]== 10){
				 count++;
					System.out.println(i);
				}
			 
			}
			System.out.println(count+"count");
	}
public static void main(String[] args) {
	countMethod();
}
}
