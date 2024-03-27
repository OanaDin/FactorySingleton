public interface IFactory {

    IBicicleta creareBicicleta(String culoare, float inaltimeCadru, float dimensiuneRoti);
    ECheieFactory getCheie();
}
