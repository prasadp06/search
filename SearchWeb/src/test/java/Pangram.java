import java.util.HashMap;
import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner in = new Scanner(System.in);
//        
//        // −1000≤V≤1000,V∈ar
//        String line = in.nextLine();
//        
//        //System.out.println(line);
//        if(pangram(line)){
//        	System.out.println("pangram");
//        }else {
//        	System.out.println("not pangram");
//        }
        
        int i = 195898;
        
        System.out.println( (i >>> 16) + " " + Integer.toBinaryString((i >>> 16)) + " " + Integer.toBinaryString(i)+" " + i/16);
	}
	
	public static boolean pangram(String arg){
		boolean is = false;
		arg = arg.toLowerCase();
		boolean[] alpha = new boolean[26];
		for(int i = 0; i<26; i++){
			alpha[i] = false;
		}
		int count=0;
		char[] chrs = arg.toCharArray();
		for(int i = 0; i<chrs.length; i++){
			if((chrs[i] >= 97 && chrs[i] <= 'z') || (chrs[i] >= 'A' && chrs[i] <= 'Z')){
				if(!alpha[(int)chrs[i]-97]){
					alpha[(int)chrs[i]-97] = true;
					count++;
				}
				if(count >= 26) return true;
			}
		}
		for(int i = 0; i<26; i++){
			System.out.print((alpha[i])?'Y':'N');
		}
		
		return is;
	}
}
