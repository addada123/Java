public class string {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            arr[i + 1] = arr[i];
        }
        System.out.println(arr[0]);
    }
}
