package max_min_avg;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
	
	private static int f(int index) {
	    if (index <= 0) {
	        return 0;
	    } else if (index == 1) {
	        return 1;
	    } else if (index == 2) {
	        return 1;
	    } else {
	        return f(index - 1) + f(index - 2);
	    }
	}

	public static void main(String[] args) {
		int mas[] ={1,2,3,45};
		int max=0;
for (int i = 0; i < mas.length; i++) {
	if(mas[i]>max){
	max=mas[i];	
	}
	}
System.out.println(max  +"= max");

	int n = 30;
	System.out.println("fibona");
	for (int i = 1; i <= n; i++) {
	
    System.out.print(f(i) + " ");
	}


for (short i = 32766; i <32767; i++) {
	System.out.println(i);
}


}
	


}
