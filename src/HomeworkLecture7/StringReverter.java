package HomeworkLecture7;

public class StringReverter {
    public static String revert(String string) {
        if (string == null || string.length() < 2) {
            return string;
        }
        //return new StringBuilder(string).reverse().toString();
        char arr[] = string.toCharArray();

        for (int i = 0; i < (arr.length / 2); i++) {
            char Temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = Temp;
        }
        return new String(arr);
    }
}
