public class RandomFunctionalities2 {
    /**
     * return the first and second word mixed together
     * @param firstWord
     * @param secondWord
     * @return secondWord/ firstWord / result
     */
    public static String mixWords(String firstWord, String secondWord){
        StringBuilder result = new StringBuilder();
        if(firstWord.equals("") && secondWord.equals("")){
            return "";
        }else if(firstWord.equals("")){
            return secondWord;
        }else if(secondWord.equals("")){
            return firstWord;
        }else{
            int size = Math.max(firstWord.length(),secondWord.length());  // compare the size of two string
            for(int i = 0;i < size;i++){
                if(i < firstWord.length()){
                    result.append(firstWord.charAt(i));
                }
                if(i < secondWord.length()){
                    result.append(secondWord.charAt(i));
                }
            }
            return result.toString();
        }
    }

    /**
     * return the word re-arranged by groups of three
     * @param word
     * @return result
     */
    public static String switcheroo(String word){
        StringBuilder result = new StringBuilder();
        int size = word.length();

        for (int i = 0; i < size/3; i++){  // Condition: How many sets containing three character can the word be divided into
            int j = i * 3;
            result.append(word.charAt(j+1));
            result.append(word.charAt(j+2));
            result.append(word.charAt(j));
        }
        if (result.length() < size-1)
            result.append(word.substring(size-2));

        if (result.length() < size)
            result.append(word.substring(size-1));

        return result.toString();

    }

    /**
     * return the longest set of characters that is repeated at both the beginning and end of a word without overlapping
     * @param word
     * @return word
     */
    public static String longestSet(String word ){
        int size = word.length();
        int mid = size/2;
        if (size%2 != 0) {  // odd number
            mid += 1;
        }
        for (; mid < size; ++mid){   // compare the substring begin at the Mid position
            if (word.substring(0,size-mid).equals(word.substring(mid))) // if we get the same substring we need return it
                return word.substring(0,size-mid);
        }
        return "";
    }
}
