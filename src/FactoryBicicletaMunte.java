public class FactoryBicicletaMunte implements IFactory {

    @Override
    public IBicicleta creareBicicleta(String culoare, float inaltimeCadru, float dimensiuneRoti)
    {
        return new BicicletaMunte(culoare, inaltimeCadru, dimensiuneRoti, "centrala");
    }

    @Override
    public ECheieFactory getCheie()
    {
        return ECheieFactory.BICICLETA_MUNTE;
    }
}
