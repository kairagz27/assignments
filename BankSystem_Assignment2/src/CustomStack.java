public class CustomStack<T> {
    private Node<T> top; // Верхушка стека

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }


    public T pop() {
        if (top == null) return null;
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (top == null) return null;
        return top.data;
    }
}