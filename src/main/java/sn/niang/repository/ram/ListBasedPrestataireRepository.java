package sn.niang.repository.ram;

import sn.niang.domain.Prestataire;
import sn.niang.domain.Prestation;
import sn.niang.repository.PrestataireRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedPrestataireRepository implements PrestataireRepository {
    private final List<Prestataire> prestataires;

    public ListBasedPrestataireRepository() {
        this.prestataires = new ArrayList<Prestataire>();
    }


    public Prestataire[] getAllByPrestation(Prestation prestation){
        prestataires.add(new Prestataire(1, "Abdoulaye", "Ndiayre", prestation));
        prestataires.add(new Prestataire(2, "Alassane", "Sene", prestation));
        prestataires.add(new Prestataire(3, "Fatou", "Thiam", prestation));
        //return prestataires.toArray();
        return prestataires.toArray(new Prestataire[0]);
    }


    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
