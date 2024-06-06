public class PalindromeWithoutReverse {
    public static void main(String[] args) {
        String name = "ABCBA";

        int start = 0;
        int end = name.length() -1;

        boolean isPal = false;
        while (start < end){
            if(name.charAt(start) == name.charAt(end)){
                isPal = true;
            }else{
                isPal = false;
                break;
            }
            start++;
            end--;
        }

        if(isPal){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is NOT palindrome");
        }
    }
}
