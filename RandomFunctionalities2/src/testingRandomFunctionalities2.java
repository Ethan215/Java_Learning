public class testingRandomFunctionalities2 {
    public static void main(String[] args){
        System.out.println("===============Testing mixWords===============");
        String fWord = "";
        String sWord = "";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: \"\" "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));

        fWord = "Bing";
        sWord = "";
        System.out.println("First word: \"\" Second Word: \"\"" );
        System.out.println("Expert return: Bing "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));

        fWord = "";
        sWord = "Number";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: Number "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));

        fWord = "Bing";
        sWord = "Ni";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: BNiing "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));

        fWord = "Bing";
        sWord = "Hong";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: BHionngg "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));

        fWord = "Los";
        sWord = "Angeles";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: LAonsgeles "+" Actural return: "+ RandomFunctionalities2.mixWords(fWord,sWord));
        System.out.println();

        System.out.println("===============Testing switcheroo===============");
        String word ="Difference" ;
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: IfDrefncee; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));
        word = "Bing";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: inBg; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));
        word = "May";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: ayM; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));

        word = "Where";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: heWre; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));

        word = "in";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: in; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));

        word = "z";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: z; "+ " Actural return: "+ RandomFunctionalities2.switcheroo(word));
        System.out.println();

        System.out.println("===============Testing longestSet===============");
        word = "adkadkkkkkkkkkkkkkyadk";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: adk; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();
        word = "acddddaaaddacd";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: acd; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();

        word = "sacsssssssac";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: sac; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();
        word = "bzsddsssdbzsd";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: bzsd; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();
        word = "iiii";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: ii; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();
        word = "";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: ; "+ " Actural return: "+ RandomFunctionalities2.longestSet(word));
        System.out.println();

    }
}