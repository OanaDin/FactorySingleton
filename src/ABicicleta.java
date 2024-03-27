public abstract class ABicicleta {

    protected String culoare;
    protected float inaltimeCadru;
    protected float dimensiuneRoti;

    public ABicicleta(String culoare, float inaltimeCadru, float dimensiuneRoti) {
        this.culoare = culoare;
        this.inaltimeCadru = inaltimeCadru;
        this.dimensiuneRoti = dimensiuneRoti;
    }

    public void setCuloare(String culoare)
    {
        this.culoare = culoare;
    }

    public void setInaltimeCadru(float inaltimeCadru)
    {
        this.inaltimeCadru = inaltimeCadru;
    }

    public void setDimensiuneRoti(float dimensiuneRoti)
    {
        this.dimensiuneRoti = dimensiuneRoti;
    }
}
