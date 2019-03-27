package Easy;

/*
 * 
 * Determine whether an integer is a palindrome. An integer is a 
 * palindrome when it reads the same backward as forward.
 * 
 * 
 * @author Kuanyow Chen (Dennis)
 * 
 */
public class Palindrome_Number {
	
	public boolean isPalindrome(int x) {
        
        if (x < 0)
            return false;
        
        int input = x;
        int outcome = 0;
        
        while(input != 0) {
            int pop = input % 10;
            input /= 10;
            outcome = outcome * 10 + pop;
        }
        
        if (outcome == x)
            return true;
        else
            return false;
        
    }
	
}
