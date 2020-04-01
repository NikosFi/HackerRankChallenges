import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();

        int start = (p/2);
        int end = 0;

        if (n%2==1)
            end = (n-p)/2;
        else
            end = (int) Math.round((n-p)/2.0);

        if(end>start) {
            System.out.println(start);
        } else {
            System.out.println(end);
        }

    }






}
