package May09;

public class GugudanModel {
    public int[] calculate(int number) {
        int[] results = new int[9];
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1);
        }
        return results;
    }
}
