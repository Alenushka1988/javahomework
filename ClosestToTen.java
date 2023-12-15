// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ClosestToTen {
    public static void main(String[] args) {
        int m = 11;
        int n = 9;
        int closest = findClosestToTen(m, n);
        System.out.println("Число " + closest + "ближе к 10.");
    }
    public static int findClosestToTen(int a, int b){
    return Math.abs(10 - a) < Math.abs(10 - b) ? a : b;
    }
}
