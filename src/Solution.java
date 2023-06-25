public class Solution{
    public static <Char> void reverse(String str){
        if (str == null || str.length() < 2) {
            System.out.println("String Not Long Enough or String is NULL");
        }

        char[] reversed = str.toCharArray();

        for(int i = reversed.length -1; i >= 0; i--  ){
            System.out.print(reversed[i]);
        }
    }

}