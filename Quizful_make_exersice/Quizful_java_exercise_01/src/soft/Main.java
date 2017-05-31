package soft;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {

	System.out.println(" value = " + switch(4));
	}
	
	public static int switch(int x){
	int j = 1;
	switch (x) {
	case 1:j++;
	case 2:j++;
	case 3:j++;
	case 4:j++;
	case 5:j++;

	default:j++;
	}
	
	return j+x;
	}
	
	
	}
	/*	int s=1;
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
			s+=i;
			if(i!=0){
				break;
			}
		}
		System.out.print("s="+s);
	}*/


/*class MyExtention extends Exception{
	
}

class MyRunTimeExeption extends RuntimeException{
	
}

class A {
	void method1(){ throw new MyExtention();}
	void method2(){ throw new MyRunTimeExeption();}
}*/