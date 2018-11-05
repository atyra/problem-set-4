/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */
import java.lang.Math;
public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		ps.surroundMe("xxxx", "yyy");
		ps.endsMeet("hello", 4);
		ps.middleMan("manager");
		ps.doubleVision("abcde");
		ps.centered("myopia", "yop");
		ps.upOrDown(42.5, 'r');
		ps.countMe("Haps cars, sums. troths: mobs? supes! gers", 's');
		ps.isNotEqual("this is not the way to do things");
		ps.triplets("AAaBBBbCcCCCc");
		ps.addMe("12avr13ge14sd10", false);
	}
	
	
	public String surroundMe(String out, String in) {
		if ((out != null && !out.equals("")) && (in != null && !in.equals("")) && out.length() == 4 && in.length() == 3) {
			String firstTwo = out.substring(0, 2);
			String lastTwo = out.substring(out.length() - 2, out.length());
			String surrounded = firstTwo + in + lastTwo;
			return surrounded;
		}
		else {
			return null;
		}
		
	}
	
	public String endsMeet(String str, int n) {
		if ((str != null && !str.equals("")) && str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= str.length()) {
			String firstEnd = str.substring(0, n);
			String lastEnd = str.substring(str.length() - n, str.length());
			String meet = firstEnd + lastEnd;
			return meet;
		}
		else {
			return null;
		}
	}
	
	public String middleMan(String str) {
		if ((str != null && !str.equals("")) && str.length() % 2 != 0) {
			int start = (str.length() / 2) - 1;
			int end = (str.length() / 2) + 2;
			String middle = str.substring(start, end);
			return middle;
		}
		else {
			return null;
		}
	}
	
	public String doubleVision(String str) {
		String doublevis = "";
		
		if (str != null && !str.equals("")) {
			for (int x = 0; x < str.length(); x++) {
				char c = str.charAt(x);
				doublevis = doublevis + c + c;
			}
			return doublevis;
		}
		else {
			return null;
		}
	}
	
	public boolean centered(String str, String target) {
		if ((str != null && !str.equals("")) && (target != null && !target.equals(""))) {
			if (target.length() != 3) {
				return false;
			}
			else {
				int index = str.indexOf(target, 1);
				if (index == -1 || index == str.length() - 3) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		else {
			return false;
		}
	}
	
	public int upOrDown(double number, char operation) {
		if (operation == 'r' || operation == 'f' || operation == 'c') {
			if (operation == 'r') {
				int rounded = (int) Math.round(number);
				return rounded;
			}
			else if (operation == 'f') {
				int floored = (int) Math.floor(number);
				return floored;
			}
			else if (operation == 'c') {
				int ceiled = (int) Math.ceil(number);
				return ceiled;
			}
		}
		else {
			return -1;
		}
		return -1;
	}
	
	public int countMe(String text, char end) {
		int count = 0;
		if ((text != null && !text.equals("")) && Character.isLetter(end) == true) {
			char[] teext = text.toCharArray();
			for (int x = 0; x < text.length(); x++) {
				if (teext[x] == end && x == text.length() - 1) {
				    count++;
				}
				else if (teext[x] == end && x != text.length() - 1) {
					if (teext[x + 1] == ' ' || teext[x + 1] == '\n' || teext[x + 1] == '\t') {
						count++;
					}
				}
			}
			System.out.println(count);
			return count;
			}
		else {
			return -1;
		}
	}
	
	public boolean isNotEqual(String str) {
	    int countIs = 0;
	    int countNot = 0;
	    if (str == null) {
	        System.out.println("false");
	        return false;
	    }
	    char[] sttr = str.toCharArray();
	    for (int x = 0; x < str.length(); x++) {
	        if ((sttr[x] == 'i' || sttr[x] == 'I') && sttr[x - 1] == ' ') {
				    if (sttr[x + 1] == 's' || sttr[x + 1] == 'S') {
				     countIs++;   
				    }
				}
			if ((sttr[x] == 'n' || sttr[x] == 'N') && sttr[x - 1] == ' ') {
			    if (sttr[x + 1] == 'o' || sttr[x + 1] == 'O') {
			        if (sttr[x + 2] == 't' || sttr[x + 2] == 'T') {
			            countNot++;
			        }
			    }
			}
	    }
	    if (countIs == countNot) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
	
	public int triplets(String str) {
	    int count = 0;
	    if (str != null && !str.equals("")) {
	        char[] sttr = str.toCharArray();
	        for (int x = 0; x < str.length() - 2; x++) {
	            if (Character.isLetter(sttr[x]) == false) {
	                return -1;
	            }
	            else if (Character.toUpperCase(sttr[x]) == Character.toUpperCase(sttr[x + 1]) && Character.toUpperCase(sttr[x]) == Character.toUpperCase(sttr[x + 2])) {
	                count++;
	            }
	        }
	        return count;
	    }
	    else {
	        return -1;
	    }
	}
	
	public int addMe(String str, boolean digits) {
	    if (str != null && !str.equals("")) {
	        char[] sttr = str.toCharArray();
	        int sum = 0;
	        int dummy = 0;
	        int count = 0;
	        for (int x = 0; x < str.length(); x++) {
	            if (sttr[x] == ' ') {
	                System.out.println(-1);
	                return -1;
	            }
	        }
	        if (digits == true) {
	            for (int y = 0; y < str.length(); y++) {
	                if (Character.isDigit(sttr[y]) == true) {
	                    sum += sttr[y] - '0';
	                    System.out.println(sum);
	                }
	            }
	            return sum;
	        }
	        else if (digits == false) {
	            for (int y = 0; y < str.length(); y++) {
	                if ((y == 0 && Character.isDigit(sttr[y]) == true) || (y != 0 && Character.isDigit(sttr[y]) == true && Character.isDigit(sttr[y - 1]) == false)) {
	                    dummy = sttr[y] - '0';
	                    for (int w = 1; w < str.length() - y; w++) {
	                        if (Character.isDigit(sttr[y + w]) == true) {
	                            count++;
	                            dummy *= 10;
	                            dummy += sttr[y + w] - '0';
	                        }
	                        else {
	                            break;
	                        }
	                    }
	                    sum += dummy;
	                }
	            }
	            return sum;
	        }
	    }
	    else {
	        return -1;
	    }
	    return 0;
	}
}