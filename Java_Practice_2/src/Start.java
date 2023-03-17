import  java.util.Formatter;
public class Start {
    public static void main(String args[]){
        int size = 5;
        String start = "*";
        for(int i = 1; i <= size;i++ ){ // control the start
            for(int b = 1; b <= size -i; b++){   // add space
                System.out.print(" ");
            }
            for(int j = 1;j <= 2*i -1;j++){  // print start
                if(j == 1  || i == size || j == (2*i-1)){ // trign parten
                    System.out.print(start);
                }else{
                    System.out.print(" ");
                }
//                if(j == ((size/2) +1) || i == ((size/2)+1)){  // cross parten
//                    System.out.print(start);
//                }else{
//                    System.out.print(" ");
//                }

//                if(i == j || (i+j) == (size+1)){  // cross parten
//                    System.out.print(start);
//                }else{
//                    System.out.print(" ");
//                }

            }
            System.out.println();
        }
    }

}
