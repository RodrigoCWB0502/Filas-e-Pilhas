public class Main {
    public static void main(String[] args) {
        // Testando a Lista Encadeada
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserePrimeiro(10);
        lista.insereUltimo(20);
        lista.insereOrdenado(15);
        System.out.print("Lista Encadeada: ");
        lista.imprime();

        // Testando a Pilha Encadeada
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.empilha(10);
        pilha.empilha(20);
        pilha.empilha(30);
        System.out.print("Pilha: ");
        pilha.mostraPilha();
        System.out.println("Topo da Pilha: " + pilha.topo());
        System.out.println("Desempilhando: " + pilha.desempilha());

        // Testando a Fila Encadeada
        FilaEncadeada fila = new FilaEncadeada();
        fila.insere(10);
        fila.insere(20);
        fila.insere(30);
        System.out.print("Fila: ");
        fila.mostraFila();
        System.out.println("Removendo da Fila: " + fila.remove());
    }
}
