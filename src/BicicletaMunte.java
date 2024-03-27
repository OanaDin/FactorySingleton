public class BicicletaMunte extends ABicicleta implements IBicicleta {
    private String tipSuspensie;

    public BicicletaMunte(String culoare, float inaltimeCadru, float dimensiuneRoti, String tipSuspensie) {
        super(culoare, inaltimeCadru, dimensiuneRoti);
        this.tipSuspensie = tipSuspensie;
    }

    public void setTipSuspensie(String tipSuspensie) {
        this.tipSuspensie = tipSuspensie;
    }

    @Override
    public String toString() {
        return "BicicletaMunte{" +
                "tipSuspensie='" + tipSuspensie + '\'' +
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
