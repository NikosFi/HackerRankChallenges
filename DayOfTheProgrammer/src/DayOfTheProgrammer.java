import java.util.Scanner;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int year = scan.nextInt();
        int day256 =0;

        if (year <= 1917 ) {
            if (year % 4 == 0) {
                day256 = 256 - 244;
            }
            else {
                day256 = 256 -243;
            }
        } else if (year > 1918 ) {
            if (year % 400 == 0 || year % 4 ==0 && year % 100 !=0) {
                day256 = 256 -244;
            } else {
                day256 = 256 - 243;
            }
        } else if (year == 1918) {
            day256 = 26;
        }

        System.out.println(day256 +"." + "09" + "." + year);
    }
}
