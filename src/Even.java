
public class Even {

	public static void main(String[] args) {
		
		Even e = new Even();
		e.fibo();
		
	}
	
	public void fibo(){
		int i=0;
		int j=1;
		int sum=0;
		int total=0;
		while(sum<4000000){
			sum = i+j;
			if(sum%2==0 && sum<4000000){
				total+=sum;
			}
			i=j;
			j=sum;
		}
		System.out.println(total);
	}
	
}
