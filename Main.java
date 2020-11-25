import java.util.Arrays;

public class PancakeSort {
    int[] heap;

    public String toString() {
        String info = "";
        for (int x : heap)
            info += x + " ";
        return info;
    }

    public void flip(int n) {
        for (int i = 0; i < (n + 1) / 2; ++i) {
            int tmp = heap[i];
            heap[i] = heap[n - i];
            heap[n - i] = tmp;
        }
        // System.out.printIn("flip(0.." + n + "): " + toString());
    }

    public int[] minmax(int n) {
        int xm, xM;
        xm = xM = heap[0];
        int posm = 0, posM = 0;

        for (int i = 1; i < n; ++i) {
            if (heap[i] < xm) {
                xm = heap[i];
                posm = i;
            } else if (heap[i] > xM) {
                xM = heap[i];
                posM = i;
            }
        }
        return new int[]{posm, posM};
    }

    public void sort(int n, int dir) {
        if (n == 0) return;

        int[] mM = minmax(n);
        int bestXPost = mM[dir];
        int altXos = mM[1 - dir];
        boolean flipped = false;

        if (bestXPost == n - 1) {
            --n;
        } else if (bestXPost == 0) {
            flip(n - 1);
            --n;
        } else if (altXos == n - 1) {
            dir = 1 - dir;
            --n;
            flipped = true;
        } else {
            flip(bestXPost);
        }
        sort(n, dir);

        if (flipped) {
            flip(n);
        }
    }

    PancakeSort(int[] numbers) {
        heap = numbers;
        sort(numbers.length, 1);
    }

    public static void main(String[] args) {
        int numbers[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));
        PancakeSort pancakes = new PancakeSort(numbers);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
            
        
