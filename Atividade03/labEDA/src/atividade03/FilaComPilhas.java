package atividade03;

public class FilaComPilhas implements Fila_IF {
    private PilhaComLista stack1; // Pilha para enfileirar elementos
    private PilhaComLista stack2; // Pilha para desenfileirar elementos

    public FilaComPilhas() {
        stack1 = new PilhaComLista();
        stack2 = new PilhaComLista();
    }

    @Override
    public void enqueue(Integer element) throws Exception {
        if (isFull()) {
            throw new Exception("A fila está cheia");
        }
        stack1.push(element);
    }

    @Override
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("A fila está vazia");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    @Override
    public int head() throws Exception {
        if (isEmpty()) {
            throw new Exception("A fila está vazia");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.top();
    }

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public boolean isFull() {
        return stack1.isFull() || stack2.isFull();
    }
}