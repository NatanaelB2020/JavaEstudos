import java.util.Scanner;

public class SolutionIfElse {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String N = "";
        if(n%2==1){
            N = "Weird";
        }
        else {
            if (n >= 2 && n <= 5) {
                N = "Not Weird";
//                and && ou || not !
            } else if (n >= 6 && n <= 20) {
                N = "Weird";
            } else {
                N = "Not Weird";
            }

        }
        System.out.println(N);

        }


    }




