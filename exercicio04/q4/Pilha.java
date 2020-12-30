class Pilha {
    int[] array = new int[5];
    int ultimaPosicao = array.length - 1;
    int i = 0;

    void empilhar(int numero) {
        array[ultimaPosicao] = numero;
        ultimaPosicao--;
        i++;
    }

    boolean estaCheia() {
        if (i == array.length) {
            return true;
        }
        else {
            return false;
        }
    }

    void desempilhar() {
        System.out.println(array[array.length-1]);
    }

    void retornaTopo() {
        System.out.println(array[0]);
    }

    void exibir() {
        for (int c = 0; c <= array.length - 1; c++) {
            System.out.println(array[c]);
        }
    }
}
