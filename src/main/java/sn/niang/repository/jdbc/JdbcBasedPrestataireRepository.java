package sn.niang.repository.jdbc;

import sn.niang.domain.Prestataire;
import sn.niang.domain.Prestation;
import sn.niang.repository.PrestataireRepository;

public class JdbcBasedPrestataireRepository implements PrestataireRepository {
    public Prestataire[] getAllByPrestation(Prestation prestation) {
        return new Prestataire[0];
    }

    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
