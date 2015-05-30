package es.solrak.extra;

public class Ejercicio3 {
	public static void timeout(){
		for(int i=0;i<1000000;i++);
	}
	public static void expected(){
		int[] a=new int[5];
		System.out.println(a[-1]);
	}

}
