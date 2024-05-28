public class Operators {
    public static void main(String arg[]){
        /*
            Unary
                Postfix exp++, exp--
                Prefix ++exp, --exp
            Arithmetic
                *, / , %, +, -

            Relational (yeilds true / false value)
                ==, != <, >, <=, >=
            Shift
                << >> >>>
            Bitwise
                & | ^

            Assignment
                = , +=, -=, *=
            Ternary
               exp ? <true = code> : <false = code>
         */

        int no = 5;
        // First inc and then use it
        System.out.println(++no); // Expected 6 as output

        System.out.println(no++); // 6
        System.out.println(no);  // Output 7

        int no1 = 100;
        int no2 = 10;

        int res = no1 + no2;
        System.out.println("Addition" + res);
        res = no1 - no2;
        System.out.println("Sub" + res);
        res = no1 * no2;
        System.out.println("Mul" + res);
        res = no1 / no2;
        System.out.println("Div" + res);
        res = no1 % no2;
        System.out.println("Mod" + res);

        System.out.println(10<<2);
        System.out.println(10>>2);

        System.out.println(no1 == no2);

        int maxNo = no1 > no2 ? no1 : no2;

//        if(no1 > no2){
//            maxNo = no1;
//        }else {
//            maxNo = no2;
//        }

        System.out.println("Ternary Max : "+ maxNo);

    }
}
