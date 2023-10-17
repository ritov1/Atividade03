package atividade03;

public class PilhaComLista implements Pilha_IF {
    private ListaEncadeada lista;
    private int tamanho;

    public PilhaComLista() {
        lista = new ListaEncadeada();
        tamanho = 0;
    }

    @Override
    public void push(Integer element) throws Exception {
        if (isFull()) {
            throw new Exception("A pilha está cheia");
        }
        lista.insert(element);
        tamanho++;
    }

    @Override
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia");
        }
        int topElement = top();
        lista.remove(topElement);
        tamanho--;
        return topElement;
    }

    @Override
    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia");
        }
        return lista.toArray()[tamanho - 1];
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public boolean isFull() {
        return tamanho == 10;
    }
}