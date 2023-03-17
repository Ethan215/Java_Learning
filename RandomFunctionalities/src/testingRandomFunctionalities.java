import java.util.Scanner;

public class testingRandomFunctionalities {


    public static void main(String args[]){

//        Die d = new Die(6);
//        final int TRIES = 10;
//        for(int i = 1; i <= TRIES; i++){
//            int n = d.cast();
//            System.out.print(n+" ");
//        }
//        System.out.println();

        System.out.println("---------- Test Method: putTogether --------");
        String fWord = "";
        String sWord = "";
        System.out.println("First word: \"\" Second Word: \"\"" );
        System.out.println("Expert return:  "+" Actural return: "+ RandomFunctionalities.putTogether(fWord,sWord));
        fWord = "Bing";
        sWord = "Hong";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: BingHong "+" Actural return: "+ RandomFunctionalities.putTogether(fWord,sWord));
        fWord = "";
        sWord = "Number";
        System.out.println("First word: " + fWord + " Second Word: " +sWord);
        System.out.println("Expert return: Number "+" Actural return: "+ RandomFunctionalities.putTogether(fWord,sWord));


        System.out.println("---------- Test Method: SwapThree --------");
        String word ="Difference" ;
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: Differeecn; "+ " Actural return: "+ RandomFunctionalities.swapThree(word));
        word = "Bing";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: Bgni; "+ " Actural return: "+ RandomFunctionalities.swapThree(word));
        word = "May";
        System.out.println("Input the word: " + word);
        System.out.println("Expert return: yaM; "+ " Actural return: "+ RandomFunctionalities.swapThree(word));

        System.out.println("----------Testing overEleven ----------");
        System.out.println("The number is 4,5,27." );
        System.out.println("Expert return: true; "+ " Actural return: "+ RandomFunctionalities.overEleven(4,5,27));
        System.out.println("The number is 5,6,7" );
        System.out.println("Expert return: false; "+ " Actural return: "+ RandomFunctionalities.overEleven(5,6,7));
        System.out.println("The number is 6,0,99." );
        System.out.println("Expert return: true; "+ " Actural return: "+ RandomFunctionalities.overEleven(6,0,99));


        System.out.println("----------Testing isOdd ----------");
        System.out.println("The number is -22." );
        System.out.println("Expert return: False; "+ " Actural return: "+ RandomFunctionalities.isOdd(-22));
        System.out.println("The number is 12." );
        System.out.println("Expert return: False; "+ " Actural return: "+ RandomFunctionalities.isOdd(12));
        System.out.println("The number is 11." );
        System.out.println("Expert return: True; "+ " Actural return: "+ RandomFunctionalities.isOdd(11));


        System.out.println("---------- Testing isEven ---------- ");
        System.out.println("The number is -17." );
        System.out.println("Expert return: False; "+ " Actural return: "+ RandomFunctionalities.isEven(-17));
        System.out.println("The number is 12." );
        System.out.println("Expert return: True; "+ " Actural return: "+ RandomFunctionalities.isEven(12));
        System.out.println("The number is 24." );
        System.out.println("Expert return: True; "+ " Actural return: "+ RandomFunctionalities.isEven(24));

        System.out.println("---------- Testing twentyOne ---------- ");
        System.out.println("The number is 24,24" );
        System.out.println("Expert return: -1; "+ " Actural return: "+ RandomFunctionalities.twentyOne(24,24));
        System.out.println("The number is 17,19." );
        System.out.println("Expert return: 19; "+ " Actural return: "+ RandomFunctionalities.twentyOne(17,19));
        System.out.println("The number is 27,18." );
        System.out.println("Expert return: 18; "+ " Actural return: "+ RandomFunctionalities.twentyOne(27,18));




    }
}
