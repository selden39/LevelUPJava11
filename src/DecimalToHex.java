public class DecimalToHex {

    public static void main(String[] args) {
        long decNum = 5555;
        long buffer;
        String hexNum = "";
        if (decNum != 0) {
            while (decNum >= 9) {
                buffer = decNum % 16;
                switch ((int) buffer) {
                    case 10:
                        hexNum = 'A' + hexNum;
                        break;
                    case 11:
                        hexNum = 'B' + hexNum;
                        break;
                    case 12:
                        hexNum = 'C' + hexNum;
                        break;
                    case 13:
                        hexNum = 'D' + hexNum;
                        break;
                    case 14:
                        hexNum = 'E' + hexNum;
                        break;
                    case 15:
                        hexNum = 'F' + hexNum;
                        break;
                    default:
                        hexNum = buffer + hexNum;
                }
                decNum = decNum / 16;
            }
            if (decNum >= 1) {
                hexNum = decNum + hexNum;
            }
        } else{
            hexNum = "0";
        }
        System.out.println(hexNum);
    }
}
