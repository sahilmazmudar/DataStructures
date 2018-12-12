public class Queue<Item> {

    private Item[] arr;
    private int currentSize, first, last;

    public Queue() {
        arr = (Item[]) new Object[5];
    }

    public Item dequeue() {
        Item item = arr[0];
        return item;
    }

    public void enqueue() {
    }

    public void resize (int capacity) {
    }

    public static void main(String[] args) {
    }
}
