public class Multiple {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
