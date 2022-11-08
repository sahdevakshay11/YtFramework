
public class fifth {

	public static void main(String[] args) {
		int rowCount=5;
		for(int i=1;i<=rowCount;i++){
			
			for(int j=1;j<=rowCount-i;j++){
				System.out.print(" ");
				
				
			}
			for(int k=1;k<=i;k++){
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}
