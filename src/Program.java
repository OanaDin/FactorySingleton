public class Program {
    public static void main(String[] args) {

        FactorySingleton factory = FactorySingleton.getInstance();

        factory.addFactory(new FactoryBicicletaMunte());
        factory.addFactory(new FactoryBicicletaOras());

        IBicicleta bicicletaMunte1 = factory.creareBicicletaCheie(ECheieFactory.BICICLETA_MUNTE, "rosu", 50, 30);
        IBicicleta bicicletaMunte2 = factory.creareBicicletaCheie(ECheieFactory.BICICLETA_MUNTE, "verde", 45, 32);
        IBicicleta bicicletaOras1 = factory.creareBicicletaCheie(ECheieFactory.BICICLETA_ORAS,"alb", 30, 28);

        //bicicletaMunte1.afisareDescriere();
        //bicicletaOras1.afisareDescriere();

        factory.addBicicleta(bicicletaOras1);
        factory.addBicicleta(bicicletaMunte1);
        factory.addBicicleta(bicicletaMunte2);
        factory.afisareBiciclete();
    }
}
