package combination;

public class combination_lib {
	public int getFactorial(int n){
		int f=1;
		for(int i=n;i>=0;i--){
			if(i==0) f*=1;
			else f*=i;
			
		}
		return f;
	}

}
