package no;

public class even {
	public static void main(String args[]) {
		int i;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print("even=");
				System.out.println(i);
			}
			else
			{
				System.out.print("odd=");
				System.out.println(i);
			}
		}
	}

}
