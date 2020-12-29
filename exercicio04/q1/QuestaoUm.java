class QuestaoUm {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i <= a.length; i++) { /*não apresentaria erro se: i < a.length*/
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}
