import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//SINGLETON

public class FactorySingleton {
    private static FactorySingleton instance = null;
    private static Map<ECheieFactory, IFactory> factories = new HashMap<>();   //map de "sub-factories": FactoryBicicletaMunte, FactoryBicicletaOras
    private List<IBicicleta> listaBiciclete = new ArrayList<>();

    public static FactorySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new FactorySingleton();
        }
        return instance;
    }

    //Metoda adaugare sub-factory in map
    public void addFactory(IFactory factory)
    {
        ECheieFactory cheie = factory.getCheie();
        factories.put(cheie, factory);
    }

    // Metoda get sub-factory dupa cheie
    public IFactory getFactory(String cheie)
    {
        return factories.get(cheie);
    }

    //Metoda creare bicicleta in functie de sub-factory
    public IBicicleta creareBicicletaCheie(ECheieFactory cheie, String culoare, float inaltimeCadru, float dimensiuneRoti)
    {
        IFactory factory = factories.get(cheie);
        return factory.creareBicicleta(culoare, inaltimeCadru, dimensiuneRoti);
    }

    public void addBicicleta(IBicicleta bicicleta)
    {
        listaBiciclete.add(bicicleta);
    }

    public void afisareBiciclete()
    {
        for(var bicicleta : listaBiciclete)
        {
            bicicleta.afisareDescriere();
        }
    }


}
