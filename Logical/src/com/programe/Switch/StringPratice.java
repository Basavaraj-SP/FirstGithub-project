package com.programe.Switch;
public class StringPratice {
	 int n=12;
	 int n2=20;
	 
	 StringPratice(int n,int n2){
		 this.n=n;
		 this.n2=n2;
	 }
	@Override
	public boolean equals(Object obj) {//up
//		object obj=s2;
		StringPratice ref=(StringPratice)obj;//dc
		return this.n==ref.n || this.n2==ref.n2;//this. ==>s1 ,ref. ==> s2
	}

	public static void main(String[] args) {
		StringPratice s1=new StringPratice(10,25);
		StringPratice s2=new StringPratice(10,28);
		if(s1.equals(s2)) {// here equals method is calling and parameter is s2
			System.out.println("n & n2 values are same");
		}
		else {
			System.out.println("n & n2 values are not same");
		}
	}

}

