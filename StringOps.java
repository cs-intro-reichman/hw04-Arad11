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
        // System.out.println(allIndexOf("Hello world",'l'));
        // System.out.println(allIndexOf("Hello worLd",'l'));
        // System.out.println(allIndexOf("Hello world",'o'));
        // System.out.println(allIndexOf("Hello world",' '));
        // System.out.println(allIndexOf("Hello world",'d'));
        // System.out.println(allIndexOf("MMMM",'M'));
    }
    
    public static String capVowelsLowRest (String string) {
        String newStr = "";
        int currentCharValue;
        for (int i = 0; i < string.length(); i++) {
            currentCharValue = Integer.valueOf(string.charAt(i));
            if ( currentCharValue == 32) {
                newStr += string.charAt(i);
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
        int chrCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                 chrCounter++;
            }
        }
        int indexCounter = 0;
        int[] charIndecies = new int[chrCounter];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                charIndecies[indexCounter] = i;
                indexCounter++;
            }
        }

        return charIndecies;
    }
}
