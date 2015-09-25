public class IntegerStack {
    private int size = 0;
    private int[] numbers = new int[10];

    public int getSize() {
        return size;
    }

    public int push(int number) {
        numbers[size++] = number;
        return numbers[size];
    }


    public int pop() {
        size--;
        return numbers[size];
    }

    public int peek() {
        return numbers[size - 1];
    }
}
