class QuestaoUm {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i <= a.length; i++) { /*não apresentaria erro se: i < a.length*/
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}

/* O código imprime de 0 a 4, quando chega no número 5 apresenta-se um erro, pois está acessando um índice inválido do array. */
