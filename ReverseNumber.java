package codes;

public class ReverseNumber {
    public static void main(String[] args) {

        int a = 12356953;

//        output = 321

//        There are three different ways to reverse numbers

//        1st way Algo

//        int rev = 0;
//
//        while (a != 0) {
//
//            int b = a%10; // Reminder
//            rev = rev * 10 + b;
//            a = a / 10;
//        }
//        System.out.println(rev);

//        2nd way String buffer class

//        StringBuffer buf = new StringBuffer(String.valueOf(a));
//        StringBuffer buf1 = buf.reverse();
//        System.out.println(buf1);
//


//        3rd way => Stringbuilder

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        StringBuilder sb1 = sb.reverse();
        System.out.println(sb);


    }
}
