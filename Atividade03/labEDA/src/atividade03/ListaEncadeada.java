package atividade03;


public class ListaEncadeada implements ListaEncadeada_IF {
    Integer valor;
    ListaEncadeada next;

    public ListaEncadeada() {
        valor = null;
        next = null;
    }

    @Override
    public boolean isEmpty() {
        return valor == null;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }else {
        	return 1+ this.next.size();	
        }
        
    }

    @Override
    public int search(Integer element) {
        if(isEmpty()) {
        	return 0;
        }
        if (valor.equals(element)) {
            return element;
        }else {
        return next.search(element);
        }
    }

    @Override
    public void insert(Integer element) {
        if(isEmpty()) {
        	this.valor = element;
        	this.next = new ListaEncadeada();
        }else {
        	next.insert(element);
        }
    }
    
    
    
    
    
    @Override
    public void remove(Integer element) {
        if (isEmpty()) {
            return;
        }else {      
        if (valor.equals(element)) {
            if (next != null) {
                valor = next.valor;
                next = next.next;
        } else {
            next.remove(element);
        	}
        }    
    }   
 }
    @Override
    public int[] toArray() {
        int[] array = new int[size()];
        toArrayRecursive(this, array, 0);
        return array;
    }

    private void toArrayRecursive(ListaEncadeada node, int[] array, int index) {
        if (!node.isEmpty()) {
            array[index] = node.valor;
            if (node.next != null) {
                toArrayRecursive(node.next, array, index + 1);
            }
        }
    }
}
