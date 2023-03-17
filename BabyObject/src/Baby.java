public class Baby {

    // Variables
    private  String hairColor;
    private  String eyeColor;
    private  String dateOfBirth;
    private static int diaperCount = 100;
    private static int peeCount = 0;
    private static int poopCount = 0;
    private static int eatCount = 0;
    private static int milksBottle = 100;
    /**
     * This is the constructor of the class Baby;
     * @param hrColor
     * @param eColor
     * @param dBirth
     * @param dpCount
     */
    public Baby(String hrColor, String eColor, String dBirth, int dpCount){
        hairColor = hrColor;
        eyeColor = eColor;
        dateOfBirth = dBirth;
        setDiaperCount(dpCount);
    }
    // Method
    /**
     * Get the number of diaper;
     * @return diaperCount
     */
    public static int getDiaperCount(){
        return diaperCount;
    }

    /**
     * Change the number of diaper
     * @param diaper
     */
    public static void setDiaperCount(int diaper){
        diaperCount = diaper;
    }

    /**
     * Calculate the number of diaper after we bought the new one.
     * @param diapers
     */
    public static void addDiaperCount(int diapers){
        diaperCount += diapers;
    }

    /**
     * Calculate remain number of diapaers
     * @param peeTimes
     * @param poopTimes
     */
    public  static void remainDiapaer(int peeTimes, int poopTimes){
        peeCount += peeTimes;
        poopCount += poopTimes;
        diaperCount -= (peeTimes+poopTimes);
    }
    /**
     * Get how many times your baby peed
     * @return peeCount
     */
    public static int getPeeCount(){
        return peeCount;
    }

    /**
     * Get how many timer your baby poop
     * @return poopCount
     */
    public static int getPoopCount(){
        return poopCount;
    }

    /**
     * Get the number of times your baby eats;
     * @return eatCount
     */
    public static int getEatCount(){
        return eatCount;
    }

    /**
     * Get the number of Milks to
     * @return milksBottle
     */
    public static int getMilksBottle(){
        return milksBottle;
    }

    /**
     * Calculate the number of milks after we add new milks bottle
     * @param milks
     * @return
     */
    public static int addMilkBottle(int milks){
        milksBottle += milks;
        return milksBottle;
    }

    /**
     * Calculate the number of milks after we have used.
     * @param eat
     * @return
     */
    public static int remainMilks(int eat){
        eatCount += eat;
        milksBottle -= eat;

        return milksBottle;
    }
    /**
     * Get the Baby hair color
     * @return hairColor;
     */
    public  String getHairColor(){
        return hairColor;
    }
    /**
     * Get the Baby eye color
     * @return eyeColor;
     */
    public  String getEyeColor(){
        return eyeColor;
    }

    /**
     * Get the Baby's date of birth
     * @return dateOfBirth
     */
    public  String getDateOfBirth(){
        return dateOfBirth;
    }

}

