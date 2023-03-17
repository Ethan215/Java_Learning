import java.util.Scanner;
public class loopTest {
    public static void main(String args[])
    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Pelase input a number: ");
//        int n = in.nextInt();
//        while(n > 999 || n < 0){
//           System.out.println("Input error Number!!");
//           System.out.print("Pelase input a number: ");
//           n = in.nextInt();
//           System.out.println();
//        }
//       int temp = n;
//       int result = 0;
//       while(temp %10 != 0 && temp != 0){
//           int temp_2 = temp%10;
//           temp /=  10;
//           result += (Math.pow(temp_2,3));
//       }
//       if(result == n){
//           System.out.println("Yes," +n+ " is shuixianHua number");
//       }else{
//           System.out.println("No," +n+ " is not a ShuiXian Hua number");
//       }

        /**
         * Print 26 letter table
         */
        int count  =0;
        for(char i = 'a'; i <= 'z'; i++ ){
            count++;
            System.out.print(i + " ");
            if(count == 6){
                System.out.println();
                count =0;
            }
        }

    }

}
