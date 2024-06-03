public class Array {
    public static void main(String arg[]){
        int array[] = new int[5];

        //Assign some value
        array[0] = 10;
        array[1] = 13;
        array[2] = 15;
        array[3] = 40;
        array[4] = 70;

        System.out.println("Length of array is, "+ array.length);

        for(int i = 0; i< array.length; i++){
            System.out.println( i + " => " + array[i]);
        }


        // Creating other array

        int array2[] = {10,20,30,40,50,60,70};
        System.out.println("Length of array2 is, "+ array2.length);

        for(int i = 0; i< array2.length; i++){
            System.out.println( i + " => " + array2[i]);
        }
    }
}
