public class Search {
    public static void main(String arg[]){
        int array2[] = {10,20,30,40,50,60,70};
        int searchElement = 30;
        System.out.println("Search if element "+ searchElement + " present in array or not");

        boolean isPresent = false;

        for(int i = 0; i< array2.length; i++){
//            System.out.println(array2[i]);
            if(searchElement == array2[i]){
                isPresent = true;
                break;
            }
        }

        if(isPresent){
            System.out.println( "Element found");
        }else {
            System.out.println("Element NOT found");
        }
    }
}
