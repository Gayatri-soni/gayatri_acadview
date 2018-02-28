package helloworld;

public class patternwhile {
	public static void main(String args[]) {
		int i=1,j;
		while(i<=5) {
			j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println("");
		}
	}

}
