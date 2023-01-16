public class RomanToInteger {
    public static void main(String[] args) {
     String rmnstr = "MCMXCIV"; // romanstring
     int len = rmnstr.length();
 
         rmnstr = rmnstr + " ";
         int result = 0;

         // loop iterate over the string (given roman numeral)
         for (int i = 0; i < len; i++) {
             char ch   = rmnstr.charAt(i);
             char next_char = rmnstr.charAt(i+1);
             
             if (ch == 'M') {
                 result += 1000;
             } else if (ch == 'C') {
                 if (next_char == 'M') {
                     result += 900;
                     i++;
                 } else if (next_char == 'D') {
                     result += 400;
                     i++;
                 } else {
                     result += 100;
                 }
             } else if (ch == 'D') {
                 result += 500;
             } else if (ch == 'X') {
                 if (next_char == 'C') {
                     result += 90;
                     i++;
                 } else if (next_char == 'L') {
                     result += 40;
                     i++;
                 } else {
                     result += 10;
                 }
             } else if (ch == 'L') {
                 result += 50;
             } else if (ch == 'I') {
                 if (next_char == 'X') {
                     result += 9;
                     i++;
                 } else if (next_char == 'V') {
                     result += 4;
                     i++;
                 } else {
                     result++;
                 }
             } else { // if (ch == 'V')
                 result += 5;
             }
         }
        System.out.println("Roman Value: "+rmnstr);
        System.out.println("Converted Integer Value: "+result+"\n");
     }
 }