public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse=0;
        int initialNumber= number;

        while(number!=0) {

            int lastDigit = number % 10;
            System.out.println(lastDigit);

            reverse=reverse*10;
            System.out.println(reverse);
            reverse=reverse+lastDigit;
            System.out.println(reverse);


            number=number/10;
            System.out.println(number);
        }



        if (initialNumber== reverse){
            return true;
        }else{
            return false;
        }

    }


}
