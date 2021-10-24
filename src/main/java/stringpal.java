public class stringpal {
    public static void main(String[] args) {

        String s = "lol", reverse = "";
        int length = s.length();
        System.out.println("Given string:" + s);

        System.out.println("Length of the string:" + length);
        for (int i=length-1; i>=0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reverse of string :" + reverse);
        if(reverse.equals(s))
        {
            System.out.println("Yes it is a Palindrome");
        }
        else System.out.println("It is not a palindrome");



    }
}