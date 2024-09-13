class PilhaEncadeada {
    private ListaEncadeada lista;

    public PilhaEncadeada() {
        lista = new ListaEncadeada();
    }

    // Empilha um elemento
    public void empilha(int dado) {
        lista.inserePrimeiro(dado);
    }

    // Desempilha o elemento do topo
    public int desempilha() {
        return lista.removePrimeiro();
    }

    // Mostra o elemento do topo sem remover
    public int topo() {
        if (lista.vazia()) {
            return -1; // Pilha vazia
        }
        return lista.removePrimeiro();
    }

    // Mostra todos os elementos da pilha
    public void mostraPilha() {
        lista.imprime();
    }
}
