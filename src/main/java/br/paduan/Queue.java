package br.paduan;

public class Queue {
    private int[] data;
    private int start, end, amount;

    public Queue(int size) {
        data = new int[size];
        start = end = amount = 0;
    }

    public boolean isEmpty() {
        return (amount == 0);
    }

    public void enqueue(int value) {

        if (isFull()) {
            return;
        }

        data[end] = value;

        amount++;

        end = (end + 1) % data.length;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return data[start];
    }

    public int size() {
        return amount;
    }

    public boolean isFull() {
        return (amount == data.length);
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int value = data[start];

        amount--;
        start = (start + 1) % data.length;

        return value;
    }

    public String show() {
        String out = "";
        int aux;

        if (!isEmpty()) {
            aux = start;

            do {
                out += data[aux] + "-";
                aux = (aux + 1) % data.length;
            } while (aux != end);
        }
        return out;
    }

}
