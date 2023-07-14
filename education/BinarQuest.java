import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarQuest {

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 6, 8, 13, 21, 26, 42};
        int toFind = 1;

        System.out.printf("Номер элемента = %s ", binaryQuest(array, toFind, 0, array.length - 1));
    }

    private static int binaryQuest(int[] array, int toFind, int down, int up) {
        int index = -1;

        while (down <= up) {
            int medium = down + (up - down) / 2;
            if (array[medium] < toFind) {
                down = medium + 1;
            } else if (array[medium] > toFind) {
                up = medium - 1;
            } else if (array[medium] == toFind) {
                index = medium + 1;
                break;
            }
        }
        return index;
    }

    @Test
    public void binaryQestTest() {
        int[] ar = {0, 2, 5, 8, 11, 16};
        int fi = 3;

        System.out.printf("Какой номер должен быть - %s \n", fi);
        System.out.printf("Номер элемента = %s ", binaryQuest(ar, 5, 0, ar.length -1));
    }

}
