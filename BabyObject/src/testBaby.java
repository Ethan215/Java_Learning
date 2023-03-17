public class testBaby {
    public static void main(String [] args){

        // Initial the 5 Baby class // Test the Set Method: setHairColcor, setEyeColor,setDateBirth,setDiaperCount()
        Baby Jack = new Baby("Black","Black","01/29/2023",100);
        Baby Ben = new Baby("Black","Black","01/30/2023",100);
        Baby John = new Baby("Gold","Blue","01/22/2023",100);
        Baby Ashely = new Baby("Red","Green","01/27/2023",100);

        //  Test the access method
        System.out.println("These ten days in the hospital was born four babies" +
                ", their names are Jack, Ben, John, Ashely");

        // Test the access method
        System.out.println("Jack's hair color is "+Jack.getHairColor() + " ,Eye Color is "+Jack.getEyeColor()
                +". His date of birth is " + Jack.getDateOfBirth());

        System.out.println("Ben's hair color is "+Ben.getHairColor() + " ,Eye Color is "+Ben.getEyeColor()
                +". His date of birth is " + Ben.getDateOfBirth());

        System.out.println("John's hair color is "+John.getHairColor() + " ,Eye Color is "+John.getEyeColor()
                +". His date of birth is " + John.getDateOfBirth() );

        System.out.println("Ashely's hair color is "+Ashely.getHairColor() + " ,Eye Color is "+Ashely.getEyeColor()
                +". Her date of birth is " + Ashely.getDateOfBirth());
        System.out.println("Therefore, We currently have " + Baby.getDiaperCount() + " dipaer "
                +Baby.getMilksBottle() +" milks bottle for baby." );


        // Test the mutator method
        Baby.addDiaperCount(100);
        Baby.addMilkBottle(100);
        System.out.println("After that we bought 100 diapers and bottles for each of them.");
        System.out.println("Now we total have " + Baby.getDiaperCount() + " diapers");
        System.out.println("Now we total have " + Baby.getMilksBottle() + " milks Bottle");

        Baby.remainDiapaer(3,3);
        Baby.remainDiapaer(4,2);
        Baby.remainDiapaer(5,1);
        Baby.remainDiapaer(3,2);

        System.out.println("John pee 3 time and 3 times poop. Jack pee 4 times and poop 2 times" +"\n" +
                "Ben pee 5 times and 1 times poop. Ashely pee 3 times and 2 times poop" +"\n" +
                "Therefore, four baby total pees times is " + Baby.getPeeCount()
                 + " , total poop times is "+Baby.getPoopCount());

        Baby.remainMilks(3);
        Baby.remainMilks(4);
        Baby.remainMilks(5);
        Baby.remainMilks(6);
        System.out.println("John ate 3 bottles of milk . Jack ate 4 bottles of milk" +"\n" +
                "Ben ate 5 bottles of milk. Ashely ate 6 bottles of milk" +"\n" +
                "Therefore, four baby total ate bottles of milks is " +Baby.getMilksBottle() +
                "and They ate a total of " + Baby.getEatCount() + " times");


    }
}

