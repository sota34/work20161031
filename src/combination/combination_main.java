package combination;

import java.util.Scanner;

public class combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Number s >");
		int s =Integer.parseInt(scan.next());
		System.out.print("Input Number r >");
		int r =Integer.parseInt(scan.next());
		
		combination_lib clib = new combination_lib();
		System.out.println(s+"!="+clib.getFactorial(s));
		System.out.println(s+"C"+r+"="+clib.getFactorial(s)/(clib.getFactorial(r)*clib.getFactorial(s-r)));
	}

}
