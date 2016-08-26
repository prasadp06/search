import java.math.BigInteger;
import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        // −1000≤V≤1000,V∈ar
        int t = in.nextInt();
        
        for(int i =0;i<t;i++){
        
	        int n = in.nextInt();
	        
	        System.out.println(countPrimes(n));
	        //System.out.println(fact(n));
        }

	}
	public static BigInteger fact(BigInteger n){
    	if(n.compareTo(BigInteger.ONE) == -1){
    		return BigInteger.ONE;
    	}else {
    		return n.multiply(fact(n.subtract(BigInteger.ONE)));
    	}
    }
	static BigInteger two = new BigInteger("2");
	
	public static long countPrimes(long n){
	    BigInteger count = new BigInteger("-1");
	   	BigInteger num = null;
	   	for(int j = 3; j<=n;j++){
	   		num = new BigInteger(""+j);
	   		num = ((fact(num.subtract(two))).subtract((num.multiply((fact(num.subtract(two)).divide(num))))));
    		count = count.add(num);
    	}
	   	return count.longValue();
	 }
}
