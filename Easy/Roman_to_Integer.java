package Easy;

public class Roman_to_Integer {
	
	public int romanToInt(String s) {
        
        int strLen = s.length();
        int start = 0;
		int result = 0;
		
		while (start < strLen) {
			//System.out.println(testcase.substring(i, i + 2));
			
			if (start + 2 <= strLen) {
				String twoChar = s.substring(start, start + 2);
				switch(twoChar) {
		            case "IV":
		            case "IX":
		                result -= 1 * 2;
		                break;
		            case "XL":
		            case "XC":
		                result -= 10 * 2;
		                break;
		            case "CD":
		            case "CM":
		                result -= 100 * 2;
		                break;
		        }
			}
			
			if (start + 1 <= strLen) {
				String oneChar = s.substring(start, start + 1);
				switch(oneChar) {
	                case "I":
	                    result += 1;
	                    break;
	                case "V":
	                    result += 5;
	                    break;
	                case "X":
	                    result += 10;
	                    break;
	                case "L":
	                    result += 50;
	                    break;
	                case "C":
	                    result += 100;
	                    break;
	                case "D":
	                    result += 500;
	                    break;
	                case "M":
	                    result += 1000;
	                    break;
	            }
			}
            start++;
	        
		}
        
        return result;
    }
	
	public static void main(String[] args) {
		
		String s = "IV";
		Roman_to_Integer rtt = new Roman_to_Integer();
		System.out.println(rtt.romanToInt(s));
	}

}
