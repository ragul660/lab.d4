public class NumberPattern {
    public static void main(String[] args) {
        int start = 0;
        for (int i = 1; i <= 5; i++) {
            start = (start * 10) + i; 
            System.out.println(start+ " ");
        }
    }
}