class FilaEncadeada {
    private ListaEncadeada lista;

    public FilaEncadeada() {
        lista = new ListaEncadeada();
    }

    // Insere um elemento na fila
    public void insere(int dado) {
        lista.insereUltimo(dado);
    }

    // Remove o primeiro elemento da fila
    public int remove() {
        return lista.removePrimeiro();
    }

    // Mostra todos os elementos da fila
    public void mostraFila() {
        lista.imprime();
    }
}
