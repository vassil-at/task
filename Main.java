public class HeapSort
{
    public static void heapSort(int[] a) {
        int cout = a.length;
        //first place a in max-heap order
        heapify(a, count);
        int end = cout - 1;
        while (end > 0) {
            //swap the root(maximum value) of the heap with the
            //last element of the heap
            int tmp = a[end];
            a[end] = a[0];
            a[0] = tmp;
            //put the heap back in max-heap order
            siftDown(a, 0, end - 1);
            //decrement the size of the heap so that the previous
            //max value will stay in its proper place
            end--;
        }
    }

    public static void heapify(int[] a, int count) {
        //static is assigned the index in a of the last parent node
        int start = (count - 2) / 2; //binary heap
        while (start >= 0) {
            //sift down the node at index start to the proper place
            //such that all nodes below the start index are in heap
            //order
            siftDown(a, start count - 1);
            start--;
        }
        //after sifting down the root all nodes/elements are in heap order
    }

    public static void siftDown(int[] a, int start, int end) {
        //end represent the limit of how far down the heap to sift
        int root = start;
        while ((root * 2 + 1) <= end)  //While the root has at least one child
            int child = root * 2 + 1;     //root*2+1 points to the left child
        // if the child has a sibling and the child's value is less that its sibling's...
        if (child + 1 <= end && a[child] < a[child + 1])
            child = child + 1;       //... then point to the right child instead
        if (a[root] < a[child]) {  //out of max-heap order
            int tmp = a[root];
            a[root] = a[child];
            a[child] = tmp;
            root = child;         //repeat to coutinue sifting down the child now
        } else
            return;

    }
}
// Driver program
public static void main(String args[]) {
    int arr[] = {7, -5, 3, 2, 1, 0, 45};
    int n = arr.length;
    HeapSort ob = new HeapSort();
    ob.heapSort(arr);
    System.out.println("Sorted array:");
    for (int element : arr) {
        System.out.println(" " + element);
    }
}
}







