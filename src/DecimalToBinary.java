import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decNum = scan.nextInt();
        String binNum = "";

        while (decNum >= 1){
            binNum = (decNum % 2) + binNum;
            decNum = decNum/2;

        }
        System.out.println("decNum = " + decNum);
        System.out.println(binNum);
    }
}
