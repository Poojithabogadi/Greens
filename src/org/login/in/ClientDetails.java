package org.login.in;

public class ClientDetails{
	public static void main(String[] args) {
		int a[] = new int[10];
		a[1]=10;
		a[2]=20;
		a[3]=10;
		a[4]=5;
		a[5]=30;
		a[6]=20;
		a[7]=15;
		a[8]=20;
		a[9]=15;
		int len =a.length;
		System.out.println("the size of the array"+len);
		int sum=0;
		for(int i:a) {
			sum = sum +i;
			System.out.println(sum);
		}
	
	}

}
