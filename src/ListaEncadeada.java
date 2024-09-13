class ListaEncadeada {

    // Classe interna privada para os nós da lista
    private class Node {
        int info;
        Node proximo;

        public Node(int info) {
            this.info = info;
            this.proximo = null;
        }
    }

    private Node lista;

    // Construtor para iniciar a lista vazia
    public ListaEncadeada() {
        lista = null;
    }

    // a) Verifica se a lista está vazia
    public boolean vazia() {
        return lista == null;
    }

    // b) Insere um elemento no início da lista
    public void inserePrimeiro(int info) {
        Node novo = new Node(info);
        novo.proximo = lista;
        lista = novo;
    }

    // c) Insere um elemento após um determinado nó
    public void insereDepois(int valorReferencia, int info) {
        Node atual = lista;
        while (atual != null && atual.info != valorReferencia) {
            atual = atual.proximo;
        }
        if (atual != null) {
            Node novo = new Node(info);
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }
    }

    // d) Insere um elemento no final da lista
    public void insereUltimo(int info) {
        Node novo = new Node(info);
        if (vazia()) {
            lista = novo;
        } else {
            Node temp = lista;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
    }

    // e) Insere um elemento de forma ordenada
    public void insereOrdenado(int info) {
        Node novo = new Node(info);
        if (vazia() || lista.info >= info) {
            novo.proximo = lista;
            lista = novo;
        } else {
            Node atual = lista;
            while (atual.proximo != null && atual.proximo.info < info) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
        }
    }

    // f) Imprime todos os elementos da lista
    public void imprime() {
        Node temp = lista;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }

    // g) Remove o primeiro elemento da lista e retorna seu valor
    public int removePrimeiro() {
        if (!vazia()) {
            Node temp = lista;
            lista = lista.proximo;
            return temp.info;
        }
        return -1; // Valor inválido para indicar que a lista estava vazia
    }

    // h) Remove o último elemento da lista e retorna seu valor
    public int removeUltimo() {
        if (!vazia()) {
            if (lista.proximo == null) {
                int valor = lista.info;
                lista = null;
                return valor;
            }
            Node atual = lista;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            int valor = atual.proximo.info;
            atual.proximo = null;
            return valor;
        }
        return -1; // Valor inválido
    }

    // i) Remove um nó específico e retorna seu valor
    public int remove(int valorReferencia) {
        if (!vazia()) {
            if (lista.info == valorReferencia) {
                return removePrimeiro();
            }
            Node atual = lista;
            while (atual.proximo != null && atual.proximo.info != valorReferencia) {
                atual = atual.proximo;
            }
            if (atual.proximo != null) {
                int valor = atual.proximo.info;
                atual.proximo = atual.proximo.proximo;
                return valor;
            }
        }
        return -1; // Valor inválido
    }
}
