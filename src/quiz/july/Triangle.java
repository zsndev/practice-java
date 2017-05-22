package quiz.july;


// 给一个正整数数组a，判定其中的3个数是否可以构成三角形
public class Triangle {

    static int[] triganle = new int[3];
    static boolean isOk = true;
    static int[] book = new int[3];

    public static void isTriangle(int[] src, int step, int sum) {
        if (step == 2) {
            int temp = triganle[0] + triganle[1];
            System.out.println(triganle[0] + "--" + triganle[1]);
            if (temp <= sum - temp) {
                isOk = false;
                return;
            }
        }
        for (int i = 0; i < src.length; i++) {
            if (book[i] == 0) {
                book[i] = 1;
                triganle[step] = src[i];
                isTriangle(src, step + 1, sum);
                book[i] = 0;
            }

        }
    }

    public static void main(String[] args) {
        int[] src = new int[]{2, 5, 3};
        int sum = 0;
        for (int i : src) {
            sum += i;
        }
        isTriangle(src, 0, sum);
        System.out.println(isOk);
    }
}
