package com;

public class KilometerLogical {
	
	static void taxi(int km) {
		
		int fare=0;
		int km2=30;
		int km5=10;
		int kmn5=20;
		int kmn=25;
		if(km<=2) {
			fare=km2;
			System.out.println("The fare price is "+fare);
		}
		else if(km<=7) {
			fare=km2+km5*km-2;
			System.out.println("The fare price is "+fare);
		}
		else if(km<=12) {
			fare=80+kmn5*(km-7);
			System.out.println("The fare price is "+fare);
		}
		else {
			fare=180+kmn*(km-12);
			System.out.println("The fare price is "+fare);
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     taxi(16);
	}

}
