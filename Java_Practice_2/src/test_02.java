public class test_02 {
    public static void main (String args[]){
        double deposit  = 100000;
        int time = 0;
        while(deposit >= 1000){
            if(deposit > 50000){
                deposit -= (deposit*0.05);
            }else{
                deposit -= 1000;
            }
            time ++;
        }
        System.out.print("time: " + time);
    }
}
