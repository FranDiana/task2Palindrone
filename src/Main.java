public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 9, 1};
        boolean isPolindrom = true;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - i - 1]) {
                isPolindrom = false;
                break;
            }
        }
        if (isPolindrom == false) {
            System.out.println("it`s not a polindrom");
        } else System.out.println("it`s a polindrom");
    }
}