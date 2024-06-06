public class RevPyramid {
    public static void main(String arg[]){

    /*
     *****
     ****
     ***
     **
     *
     */
        int size = 5;
        System.out.println("\n============ Rev Pyramid  =============");
        for(int i = 1; i <= size; i++){
            for(int j = size - i; j >= 0; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

/*

**
**

 */
