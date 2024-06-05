public class PalindromeString {
    public static void main(String[] args) {

        String name = "abcba";

        // Step 1: reverse
        // Step 2: check original & reverse is same or not
        // Step 3: result print

        String reverse = "";
        //Start from end
        for(int i = name.length() - 1; i>=0; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse name is "+ reverse);

        if(name.equals(reverse)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is NOT palindrome");
        }

    }
}
