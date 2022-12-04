package com;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34;
		int n=num+1;
		int sq=1;
		int c=0;
for(int i=1;i<=n;i++) {
	 sq=i*i;
	
	if(n==sq) {
		c++;
		break;
	}
}
if(c==1) {
	System.out.println("sunny number");
}
else {
	System.out.println("Not a sunny number");
}

		
	}
}

	
	


