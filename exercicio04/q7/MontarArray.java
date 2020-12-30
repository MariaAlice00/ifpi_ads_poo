class MontarArray {
    int[] array = new int[5];

    int ultimaPosicao = array.length - 1;
    int i = 0;

    void montar(int numero) {
        array[ultimaPosicao] = numero;
        ultimaPosicao--;
        i++;   
    }

    void exibir() {
        for (int c = 0; c <= array.length - 1; c++) {
            System.out.println(array[c]);
        }
    }
}
