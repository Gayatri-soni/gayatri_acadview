package gayatriproject1;

public class palindrome {
	public static void main(String args[]) {
	int sum=0,r,n,temp;
	n=505;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println("this number is a pallindrome");
	}
		else { 
			System.out.println("this is not a pallindrome");
		
		}
	}
	}


	


