public class Teste {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bovino v = new Bovino();
        Peixe p = new Peixe();

        v.setEspecie("Vaca");
        System.out.println(v.getEspecie());
        v.setProducaoLeite(20);
        System.out.println(v.getProducaoLeite());

        p.setEspecie("Peixe");
        System.out.println(p.getEspecie());
        p.setProfundidade(200);
        System.out.print(p.getProfundidade());
    }
}
