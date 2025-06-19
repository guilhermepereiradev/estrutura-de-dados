public class Main {

    public static void main(String[] args) {
        int[] array = {5, 3, 17, 10, 84, 19, 6, 22, 9};
        MaxHeap heap = new MaxHeap(array);
        heap.constroiMaxHeap();
        heap.printHeap();
    }
}