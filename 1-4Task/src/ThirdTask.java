import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        int start = -1;
        int stop = -1;
        Scanner in = new Scanner(System.in);

        while (start < 0 || stop < (start + 10)) {
            System.out.println("Enter range of numbers consisting of 10 or more positive numbers: ");
            try {
                start = in.nextInt();
                stop = in.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, only positive numbers are allowed");
                in.next();
            }

        }
        int sum = getSum(getArray(start, stop));
        System.out.println("Sum of numbers which can be divided on 3 but can not be divided on 5: " + sum);


    }

    private static List getArray(int start, int stop) {

        int length = stop - start;
        int[] arr = new int[length + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= length; i++) {
            arr[i] = start;
            start++;
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }
}
