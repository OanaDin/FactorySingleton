public class FactoryBicicletaOras implements IFactory {


    @Override
    public IBicicleta creareBicicleta(String culoare, float inaltimeCadru, float dimensiuneRoti)
    {
        return new BicicletaOras(culoare, inaltimeCadru, dimensiuneRoti, 300);
    }
    @Override
    public ECheieFactory getCheie()
    {
        return ECheieFactory.BICICLETA_ORAS;
    }
}