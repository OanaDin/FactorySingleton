public class BicicletaOras extends ABicicleta implements IBicicleta {
    private float dimensiuneCos;

    public BicicletaOras(String culoare, float inaltimeCadru, float dimensiuneRoti, float dimensiuneCos) {
        super(culoare, inaltimeCadru, dimensiuneRoti);
        this.dimensiuneCos = dimensiuneCos;
    }


    public void setDimensiuneCos(float dimensiuneCos) {
        this.dimensiuneCos = dimensiuneCos;
    }

    @Override
    public String toString() {
        return "BicicletaOras{" +
                "dimensiuneCos=" + dimensiuneCos +
                ", culoare='" + culoare + '\'' +
                ", inaltimeCadru=" + inaltimeCadru +
                ", dimensiuneRoti=" + dimensiuneRoti +
                '}';
    }

    @Override
    public void afisareDescriere() {
        System.out.println(this);
    }
}
