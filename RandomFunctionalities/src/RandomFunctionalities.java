
public class RandomFunctionalities {
    /**
     * The first and second word together except if two equal letters are created when put together
     * @param firstWord
     * @param secondWord
     * @return result or (firstWord+secondWord)
     */
    public static String putTogether(String firstWord,String secondWord){
        // we can't return the Null String in the Method
        String result;
        if (firstWord.equals("") && secondWord.equals("")){
            result = "";
        }else if (firstWord.equals("")){
            result = secondWord;
        }else if (secondWord.equals("")){
            result = firstWord;
        } else{
            if (firstWord.substring(firstWord.length()-1).equals(secondWord.substring(0,1))){
                result = firstWord + secondWord.substring(1);
            } else{
                result = firstWord + secondWord;
            }
        }
        return result;
    }

    /**
     * Return the word with the last three letters in reverse order
     * @param word
     * @return result
     */
    public static String swapThree(String word){
        String result;
        if (word.length() >= 3) {
            result = word.substring(0,word.length()-3);
            result += word.substring(word.length() - 1);
            result += word.substring(word.length() - 2, word.length() - 1);
            result += word.substring(word.length() - 3, word.length() - 2);
        } else if (word.length() == 2) {
            result = word.substring(1);
            result += word.substring(0,1);
        } else {
            result = word;
        }

        return result;
    }

    /**
     * The method should return 'true' if any one of the three integers is greater than the sum of the other two by 11 or more
     * @param first
     * @param second
     * @param third
     * @return True/False
     */
    public static boolean overEleven(int first, int second, int third){
        if ((first > (second + third + 11)) || (second > (first + third + 11)) || (third > (first + second))) {
            return true;
        }
        return false;
    }
    /**
     *The method should return "true" if the number passed is an odd number and "false" other wise
     * @param number
     * @return True / False
     */
    public static boolean isOdd(int number){
        if(number%2 != 0){
            return true;
        }
        return false;
    }

    /**
     *The method should return "true" if the number passed is an even number and "false" other wise
     * @param numner
     * @return True / False
     */
    public static boolean isEven(int numner){
        if(numner%2 == 0){
            return true;
        }
        return false;
    }

    /**
     * The method should return the number that is closest to twenty one or equal to twenty one without going over
     * @param firstNumber
     * @param secondNumber
     * @return -1 /Math.max(firstNumber,secondNumber) / Math.min(firstNumber,secondNumber)
     */
    public static int twentyOne(int firstNumber, int secondNumber){
        if((firstNumber == secondNumber) ||(firstNumber >= 21 && secondNumber >= 21)){
            return -1;
        }
        if(Math.max(firstNumber,secondNumber) <= 21){
            return Math.max(firstNumber,secondNumber);
        }
        return Math.min(firstNumber,secondNumber);
    }


}
