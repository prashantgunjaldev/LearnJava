public class Variables {
    public static void main(String arg[]){
    //
        /*
            Primitive & Non primitive
            =========================
            Primitive (8)
                - boolean (1 bit) (true / false)
                - char  (2 byte) 'a'
                - int   (4 byte)
                - long  (8 byte)
                - short (2 byte)
                - float (4 byte)
                - double (8 byte)
                - byte (1 byte)

            Non Primitive
                - string
                - Array
         */

        boolean flag = true;
        System.out.println("Data type (boolean) : " + flag);

        byte a = 10;
        System.out.println("Data type (byte) : " + a);

        short b = 10000;
        System.out.println("Data type (short) : " + b);

        int c = 900000;
        System.out.println("Data type (int) : " + c);

        long d = 100000L;
        System.out.println("Data type (long) : " + d);

        float e = 1.2f;
        System.out.println("Data type (float) : " + e);

        double f = 1.2456;
        System.out.println("Data type (double) : " + f);

        char g = 'A';
        System.out.println("Data type (char) : " + g);
    }
}
