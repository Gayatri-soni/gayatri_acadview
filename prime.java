package no;

public class prime {
 public static void main(String args[]) {
	 int n=119,i;
	 for(i=2;i<n;i++) {
		 if(n%i==0) {
			 break;
		 }
	 }
		 if(i==n)
			 System.out.println("prime");
		 else
			 System.out.println("not prime");
	 
 }
}
