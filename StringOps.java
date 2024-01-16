public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // System.out.println("z " + Integer.valueOf('z'));
        // System.out.println("a " + Integer.valueOf('a'));
        // System.out.println("e " + Integer.valueOf('e'));
        // System.out.println("i " + Integer.valueOf('i'));
        // System.out.println("o " + Integer.valueOf('o'));
        // System.out.println("u " + Integer.valueOf('u'));
        // System.out.println("A " + Integer.valueOf('A'));
        // System.out.println("Z " + Integer.valueOf('Z'));
        System.out.println(camelCase("Hello World"));
        System.out.println(camelCase("HELLO world"));
        System.out.println(camelCase(" tWo wordS"));
        System.out.println(camelCase("world"));
        System.out.println(camelCase("“ Intro to coMPUter sCIEncE "));
    }
    
    public static String capVowelsLowRest (String string) {
        String newStr = "";
        int currentCharValue;
        for (int i = 0; i < string.length(); i++) {
            currentCharValue = Integer.valueOf(string.charAt(i));
            if ( currentCharValue == 32) {
                continue;
            }
            if(currentCharValue == 97 || currentCharValue == 101 || currentCharValue == 111 || currentCharValue == 117 || currentCharValue == 105) {
                newStr += (char)(currentCharValue - 32);
            }
            else if(currentCharValue == 65 || currentCharValue == 62 || currentCharValue == 79 || currentCharValue == 85 || currentCharValue == 73) {
                newStr += (char)(currentCharValue);
            }
            else if (currentCharValue >= 65 && currentCharValue <= 90){
                newStr += (char)(currentCharValue + 32);
            }
            else if (currentCharValue >= 97 && currentCharValue <= 122) {
                newStr += (char)(currentCharValue);
            }
        }

        return newStr;
    }

    public static String camelCase (String string) {
        String newStr = "";
        char currentChar;
        int charValue;
        int prevValue = -1;
        boolean isFirstLetter = false;
        for (int i = 0; i < string.length(); i++) {
            currentChar = string.charAt(i);
            charValue = Integer.valueOf(currentChar);
            if (i > 0) {
                prevValue = Integer.valueOf(string.charAt(i - 1));
            }
            if ( charValue == 32 ) {
                continue;
            }
            else if (!isFirstLetter) {
                if (charValue >= 97 && charValue <= 122) {
                    newStr = newStr + currentChar;
                }
                else if (charValue >= 65 && charValue <= 90) {
                    newStr = newStr + (char)(charValue + 32);
                }

                isFirstLetter = true;
            }
            else if (prevValue == 32) {
                if (charValue >= 97 && charValue <= 122) {
                    newStr = newStr + (char)(charValue - 32);
                }
                else if (charValue >= 65 && charValue <= 90) {
                    newStr = newStr + currentChar;
                }
            }
            else if (prevValue != 32) {
                if (charValue >= 97 && charValue <= 122) {
                    newStr = newStr + currentChar;
                }
                else if (charValue >= 65 && charValue <= 90) {
                    newStr = newStr + (char)(charValue + 32);
                }
            }
        }
        
        return newStr;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
