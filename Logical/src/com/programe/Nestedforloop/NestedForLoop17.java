package com.programe.Nestedforloop;

public class NestedForLoop17 {

	public static void main(String[] args) {
		int a = 1;
		int c = 65;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i==1) {
					System.out.print("1"+" ");
				} else if(i==2){
					System.out.print("A" + " ");
				}
				else if(i==3){
					System.out.print("2" + " ");
				}
				else if(i==4){
					System.out.print("B" + " ");
				}
				else if(i==5){
					System.out.print("3" + " ");
				}
			}

			System.out.println();
		}

	}

}
