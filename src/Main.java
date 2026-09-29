public class Main {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        String output = reversLetters(input);

        System.out.println("Input: " + input);
        System.out.println("Result " + output);
    }

    public static String reversLetters(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right){
            if (!Character.isLetter(chars[left])){
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            }

            else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}