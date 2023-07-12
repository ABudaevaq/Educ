import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class Bubble {

    public static void main(String[] args) {
        int[] bubble = new int[]{5, 6, 9, 2, 1, 12};

        int[] sortBubble = new int[]{1, 2, 5, 6, 9, 12};
        int so;
        while (bubble != sortBubble) {
            for (int i = 1; i < bubble.length - 1; i++) {
                if (bubble[i] < bubble[i - 1]) {
                    so = bubble[i];
                    bubble[i] = bubble[i - 1];
                    bubble[i - 1] = so;
                }
            }
        }

        System.out.printf("Отсортированный массив: %s \n", Arrays.toString(bubble));
    }


}
