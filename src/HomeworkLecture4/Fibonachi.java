package HomeworkLecture4;

/**
 * Created by vitos on 17.03.2017.
 */
public class Fibonachi {
    public static void main(String[] args) {
    int n = 18;
    for (int i = 1; i < n + 1; i++){
        System.out.println(fibbonachi(i));
    }
    }
    public static int fibbonachi (int n){
            if (n == 1)
                return 1;
            if (n == 2)
            return 1;
            int res = fibbonachi((n - 1)) + fibbonachi((n - 2));
            return res;
    }
}

