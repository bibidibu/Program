import java.util.Scanner;

public class main {
	//hi ganzo bn 
	//12345

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(" ");
		System.out.println(":");
		Scanner scan=new Scanner(System.in);
		
		int n = 0;
		if(n>0&&n<1000) {
		int[] mas=new int[n];
		System.out.println(":");
		System.out.print("n["+1+"]=");
		mas[0]=scan.nextInt();
		for(int i=1; i<n; i++) {
			System.out.print("n["+(i+1)+"]=");
	        mas[i]=scan.nextInt();
			if(mas[i-1]==mas[i]) {
				System.out.println(":");
				System.out.print("n["+(i+1)+"]=");
				mas[i]=scan.nextInt();
			}
			else {
				System.out.print("");
			}
		}
		int top=0;
		int bottom=0;
		for(int i=1; i<(n-1); i++) {
			if(mas[i-1]<mas[i]&&mas[i]>mas[i+1]) {
				top=top+1;
			}
			else if(mas[i-1]>mas[i]&&mas[i]<mas[i+1]) {
				bottom=bottom+1;
			}
		}
		System.out.println(""+top);
		System.out.println(""+bottom);
	}
		
		else {
			System.out.println("");
		}
		}
	catch(Exception e) {
		System.out.println(".");
	}
	}
	
}
