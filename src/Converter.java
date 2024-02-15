import java.util.*;

public class Converter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int decimalSum;

        System.out.print("Please enter string of Roman numerals to convert: ");
        char[] romanNum = userInput.nextLine().toUpperCase().toCharArray();

        decimalSum = convertRomToDec(romanNum);
        System.out.println("Converted to decimal: " + decimalSum);
    }

    private static int values(char letter){
        if(letter == 'M') {
            return 1000;
        }if(letter == 'D'){
            return 500;
        }if(letter == 'C'){
            return 100;
        }if(letter == 'L'){
            return 50;
        }if(letter == 'V'){
            return 5;
        }if(letter == 'X'){
            return 10;
        }if(letter == 'I'){
            return 1;
        }
        return 0;
    }

    public static int convertRomToDec(char[] input){
        int sum = 0;
        sum += values(input[0]);
        for(int i = 1; i < input.length; i++){
            if (values(input[i]) > values(input[i - 1])){
                sum += values(input[i]) - (values(input[i - 1]) * 2);
            } else { sum += values(input[i]);}
        }
        return sum;
    }

}
