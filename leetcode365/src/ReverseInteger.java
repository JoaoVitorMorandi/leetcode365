public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }

    public static int reverse(int x) {
        try{
            String number = String.valueOf(x);

            int f = number.length() - 1;
            StringBuilder result = new StringBuilder();
            while( f >= 0) {
                if(number.charAt(f) == '-'){
                    result.insert(0, '-') ;
                } else {
                    result.append(number.charAt(f));
                }
                f--;
            }
            return Integer.parseInt(result.toString());

        } catch(Exception e){
            return 0;
        }
    }
}
