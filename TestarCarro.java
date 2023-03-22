public class TestarCarro {
    public static void main(String[] args) {

        Carro um = new Carro();
        um.qtdeportas = 5;
        um.setanofabricacao(1970);
        um.renavam = 117859;

        Carro dois = new Carro();
        dois.qtdeportas = 4;
        dois.setanofabricacao(2023);
        dois.renavam = 798110;


        if (um.getanofabricacao() < dois.getanofabricacao()) {
            System.out.println(um.renavam);
        }
        else {
            System.out.println(dois.renavam);

        }


    }
}