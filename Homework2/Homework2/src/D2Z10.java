import java.util.Scanner;

public class D2Z10 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter a number: ");
        int a = input.nextInt();
        
        input.close();
        
        if(a == 0){
    		System.out.print("zero");
        }	
    	
    	if(a == 1){
    		System.out.print("one");
        }
        	
        if(a == 2){
        	System.out.print("two");
        }
        	
        if(a == 3){
        	System.out.print("three");
        }
        	
        if(a == 4){
        	System.out.print("four");
        }
        	
        if(a == 5){
        	System.out.print("five");
        }
        	
        if(a == 6){
        	System.out.print("six");
        }
        	
        if(a == 7){
        	System.out.print("seven");
        }
        	
        if(a == 8){
        	System.out.print("eight");
        }
        	
        if(a == 9){
        	System.out.print("nine");
        }
    
    	
        if(a == 10){
        	System.out.print("ten");
        }
        	
        if(a == 11){
        	System.out.print("eleven");
        }
        	
        if(a == 12){
        	System.out.print("twelve");
        }
        	
        if(a == 13){
        	System.out.print("thirteen");
        }
        	
        if(a == 14){
        	System.out.print("fourteen");
        }
        	
        if(a == 15){
        	System.out.print("fifteen");
        }
        	
        if(a == 16){
        	System.out.print("sixteen");
        }
        	
        if(a == 17){
        	System.out.print("seventeen");
        }
        	
        if(a == 18){
        	System.out.print("eighteen");
        }
        	
        if(a == 19){
        	System.out.print("nineteen");
        }
        
        	
        	if(a > 19 && a < 100){

        		int n = a / 10;
        		
        		int m = a % 10;
        		
                String numbers = null;
        		
        		switch(m){
        		case 0: numbers = "";
        		break;
        		case 1: numbers = "-one";
        		break;
        		case 2: numbers = "-two";
        		break;
        		case 3: numbers = "-three";
        		break;
        		case 4: numbers = "-four";
        		break;
        		case 5: numbers = "-five";
        		break;
        		case 6: numbers = "-six";
        		break;
        		case 7: numbers = "-seven";
        		break;
        		case 8: numbers = "-eight";
        		break;
        		case 9: numbers = "-nine";
        		break;
        		}
        		
        		
        		
        		if(n == 2){
        			System.out.println("twenty" + numbers);
        		}
        		
        		if(n == 3){
        			System.out.println("thirty" + numbers);
        		}
        		
        		if(n == 4){
        			System.out.println("forty" + numbers);
        		}
        		
        		if(n == 5){
        			System.out.println("fifty" + numbers);
        		}
        		
        		if(n == 6){
        			System.out.println("sixty" + numbers);
        		}
        		
        		if(n == 7){
        			System.out.println("seventy" + numbers);
        		}
        		
        		if(n == 8){
        			System.out.println("eighty" + numbers);
        		}
        		
        		if(n == 9){
        			System.out.println("ninety" + numbers);
        		}
        	
        	}
        	
        	

        
        if(a >= 100 && a <= 999){
        	
        	String and = "and";
        	
        	String no = " ";
        	
        	String last = "";
        	
        	String again = "";
        	
        	String cool = "";
        	
int v = a % 100;
        	
        	if(v >=1 && v <=19)
        	
        		switch(v){
           		case 0: last = "";
           		break;
           		case 1: last = "one";
           		break;
           		case 2: last = "two";
           		break;
           		case 3: last = "three";
           		break;
           		case 4: last = "four";
           		break;
           		case 5: last = "five";
           		break;
           		case 6: last = "six";
           		break;
           		case 7: last = "seven";
           		break;
           		case 8: last = "eight";
           		break;
           		case 9: last = "nine";
           		break;
           		case 10: last = "ten";
        		break;
           		case 11: last = "eleven";
         		break;
         		case 12: last = "twelve";
         		break;
         		case 13: last = "thirteen";
         		break;
         		case 14: last = "fourteen";
         		break;
         		case 15: last = "fifteen";
         		break;
         		case 16: last = "sixteen";
         		break;
         		case 17: last = "seventeen";
         		break;
         		case 18: last = "eighteen";
         		break;
         		case 19: last = "nineteen";
         		break;
           		}
        	
        	if(v > 19 && v <= 99){
        	
        	int s = v / 10;
    		
    		switch(s){
    		case 0: again = "";
    		break;
    		case 2: again = "twenty";
    		break;
    		case 3: again = "thirty";
    		break;
    		case 4: again = "forty";
    		break;
    		case 5: again = "fifty";
    		break;
    		case 6: again = "sixty";
    		break;
    		case 7: again = "seventy";
    		break;
    		case 8: again = "eighty";
    		break;
    		case 9: again = "ninety";
    		break;
    		}
        	
        	
        	int w = v % 10;
    		
    		switch(w){
       		case 0: cool = "";
       		break;
       		case 1: cool = "-one";
       		break;
       		case 2: cool = "-two";
       		break;
       		case 3: cool = "-three";
       		break;
       		case 4: cool = "-four";
       		break;
       		case 5: cool = "-five";
       		break;
       		case 6: cool = "-six";
       		break;
       		case 7: cool = "-seven";
       		break;
       		case 8: cool = "-eight";
       		break;
       		case 9: cool = "-nine";
    		}
        	}
        	
        	int b = a / 100;
        	
        	if(v > 0){
        	if(b == 1){
        		System.out.println("one hundred" + no + and + no + last + again + cool);
        	}
        	
        	if(b == 2){
        		System.out.println("two hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 3){
        		System.out.println("three hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 4){
        		System.out.println("four hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 5){
        		System.out.println("five hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 6){
        		System.out.println("six hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 7){
        		System.out.println("seven hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 8){
        		System.out.println("eight hundred" + no + and + no +  last + again + cool);
        	}
        	
        	if(b == 9){
        		System.out.println("nine hundred" + no + and + no +  last + again + cool);
        	}
        	}
        	if(v == 0){
        		if(b == 1){
            		System.out.println("one hundred");
            	}
            	
            	if(b == 2){
            		System.out.println("two hundred");
            	}
            	
            	if(b == 3){
            		System.out.println("three hundred");
            	}
            	
            	if(b == 4){
            		System.out.println("four hundred");
            	}
            	
            	if(b == 5){
            		System.out.println("five hundred");
            	}
            	
            	if(b == 6){
            		System.out.println("six hundred");
            	}
            	
            	if(b == 7){
            		System.out.println("seven hundred");
            	}
            	
            	if(b == 8){
            		System.out.println("eight hundred");
            	}
            	
            	if(b == 9){
            		System.out.println("nine hundred");
            	}
        		
        	}
     		
        }
        
        if(a < 0 || a > 999){
        	System.out.println("Try with another number between 0 and 999.");
        }
     }
	
}


