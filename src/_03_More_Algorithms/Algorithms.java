package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int mult = num1*num2;
    	String answer = num1 + " x " + num2 + " = " + mult;
    	return answer;
    }
    
   	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		int factors = 0;
        int j = 1;
        while(j <= i) {
            if(i % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
	}

	public static boolean isSquare(int i) {
		// TODO Auto-generated method stub
		for(int j = 1; j<(i/2+2); j++) {
			if(j*j == i) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCube(int i) {
		// TODO Auto-generated method stub
		for(int j = 1; j<(i/3+3); j++) {
			if(j*j*j == i) {
				return true;
			}
		}
		return false;
	}
	
	public static int findBrokenEgg(List<String> eggs) {
       for(int i = 0; i<eggs.size(); i++) {
    	   if(eggs.get(i).equals("cracked")) {
    		   return i;
    	   }
       }
		return 0;
    }

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int i = 0; i<oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				num = num+1;
			}
		}
		return num;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = peeps.get(0);
		for(int i = 0; i<peeps.size()-1; i++) {
			if(peeps.get(i+1)>peeps.get(i)) {
				tallest = peeps.get(i+1);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String word = words.get(0);
		for(int i = 1; i<words.size(); i++) {
			int length = words.get(i).length();
			if(length>word.length()) {
				word = words.get(i);
			}
		}
		return word;
	}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for(int i = 0; i<message1.size(); i++) {
			if(message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size(); j++) {
	    		for (int k = 0; k < results.size() - 1; k++) {
	    			if( results.get(k) > results.get(k+1) ) {
	    				double element = results.get(k);
	    				results.set(k, results.get(k+1));
	    				results.set(k+1, element);
	    			}
	    		}
	    	}
    	}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size(); j++) {
	    		for (int k = 0; k < unsortedSequences.size() - 1; k++) {
	    			if( unsortedSequences.get(k).length() > unsortedSequences.get(k+1).length() ) {
	    				String element = unsortedSequences.get(k);
	    				unsortedSequences.set(k, unsortedSequences.get(k+1));
	    				unsortedSequences.set(k+1, element);
	    			}
	    		}
	    	}
    	}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
        int n = 4;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                // to compare one string with other strings
                if (words.get(i).compareTo(words.get(j)) > 0) {
                    // swapping
                    temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }
		return words;
	}
}
