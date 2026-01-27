public class IntToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(1234));
        //SOLUÇÃO NOJENTA
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        while(num > 0){
            char firstDigit = String.valueOf(num).charAt(0);
            if(firstDigit != '4' && firstDigit != '9'){
                if(num < 5){
                    result.append('I');
                    num = num - 1;
                }
                else if(num < 10){
                    result.append('V');
                    num = num - 5;
                }
                else if(num < 50){
                    result.append('X');
                    num = num - 10;
                }
                else if(num < 100){
                    result.append('L');
                    num = num - 50;
                }
                else if(num < 500){
                    result.append('C');
                    num = num - 100;
                }
                else if(num < 1000){
                    result.append('D');
                    num = num - 500;
                }
                else{
                    result.append('M');
                    num = num - 1000;
                }
            } else if (firstDigit == '4') {
                if(num < 5){
                    result.append("IV");
                    num = num - 4;
                }
                else if(num < 50){
                    result.append("XL");
                    num = num - 40;
                }
                else if(num < 1000){
                    result.append("CD");
                    num = num - 400;
                }
            } else{
                if(num < 10){
                    result.append("IX");
                    num = num - 9;
                }
                else if(num < 100){
                    result.append("XC");
                    num = num - 90;
                }
                else if(num < 1000){
                    result.append("CM");
                    num = num - 900;
                }
            }
        }

        return result.toString();
    }
}
