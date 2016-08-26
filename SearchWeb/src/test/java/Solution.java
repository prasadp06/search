import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        // −1000≤V≤1000,V∈ar
        int t = in.nextInt();
        if(t < 0 || t > 20){
            throw new IllegalArgumentException("Should be greater than 0 and less than or equal to 20");
        }
        
        for(int i =0;i<t;i++){
        
	        int n = in.nextInt();
	        //1≤n≤1000
	        
//	        if(n < 0 || n > 40){
//	            throw new IllegalArgumentException("Should be greater than 0 and less than or equal to 40");
//	        }
	        System.out.println(checkNumber(n));
	        //System.out.println(fact(n));
        }
        
        
    }
    
    public static long checkNumber(long n){
    	if(n > 3){
    		int comb = 1;
    		int r =0;
    		BigInteger num;
    		while (n>3){
    			n = n - 4;
    			r++;
    			num = new BigInteger(""+(n+r));
    			comb += combination(num,new BigInteger(""+r)).intValue();
    		}
    		System.out.println(comb);
    		return countPrimes(comb-1);
    	}else {
    		return 0;
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
		if(n<1){
			return 0;
		}else if (n==1){
			return 1;
		}else if (n==2){
			return 2;
		}else if (n==3){
			return 3;
		}
		
	    BigInteger count = new BigInteger("-1");
	   	BigInteger num = null;
	   	for(int j = 3; j<=n;j++){
	   		num = new BigInteger(""+j);
	   		num = ((fact(num.subtract(two))).subtract((num.multiply((fact(num.subtract(two)).divide(num))))));
    		count = count.add(num);
    	}
	   	return count.longValue();
	 }
    
    public static long isPrimes(long n){
    	
    	if(n <= 1){
    		return 0; 
    	}
    	else {
    		for(long i=2;i<=n/2;i++){
    			if(n%i==0){
    				return 0;
    			}
    		}
    		return 1;
    	}
    }
    
    public static BigInteger combination(BigInteger n, BigInteger r){
    	return fact(n).divide((fact(n.subtract(r))));
    }  
    
    
    
    public static BigInteger feb(BigInteger a, BigInteger b, int n){
        if(n == 2) {
            return b;
        }
        else if( n == 1){
            return a;
        } else {
        	BigInteger c = b.multiply(b);
        	c = c.add(a);
            return feb(b, c, n-1);
        }
        
    }
}