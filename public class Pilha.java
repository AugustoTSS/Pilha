public class Pilha {
    private int maxSize;      // Tamanho máximo da pilha
    private int top;          // Indica o topo da pilha
    private int[] stackArray; // Array para armazenar os elementos da pilha

    // Construtor da pilha
    public Pilha(int size) {
        maxSize = size;          // Define o tamanho máximo da pilha
        stackArray = new int[maxSize]; // Inicializa o array com o tamanho máximo
        top = -1;                // Inicialmente, a pilha está vazia (topo em -1)
    }

    // Método para adicionar um elemento na pilha
    public void insere(int value) {
        if (cheia()) {
            System.out.println("A pilha está cheia. Não é possível adicionar o elemento: " + value);
        } else {
            top++;                  // Move o topo para a próxima posição
            stackArray[top] = value; // Adiciona o valor no topo da pilha
        }
    }

    // Método para remover um elemento do topo da pilha
    public int remove() {
        if (vazia()) {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return -1; // Retorna -1 para indicar erro (pilha vazia)
        } else {
            int temp = stackArray[top]; // Salva o elemento do topo
            top--;                      // Move o topo para a posição anterior
            return temp;                // Retorna o elemento removido
        }
    }

    // Método para verificar se a pilha está vazia
    public boolean vazia() {
        return (top == -1); // Se topo for -1, a pilha está vazia
    }

    // Método para verificar se a pilha está cheia
    public boolean cheia() {
        return (top == maxSize - 1); // Se topo for igual ao tamanho máximo menos 1, a pilha está cheia
    }

    // Método para imprimir todos os elementos da pilha
    public void imprime() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Elementos na pilha:");
            for (int i = 0; i <= top; i++) { // Percorre do início até o topo
                System.out.println(stackArray[i]);
            }
        }
    }
}
