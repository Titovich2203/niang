package sn.niang.repository;

import sn.niang.domain.Prestataire;
import sn.niang.domain.Prestation;

public interface PrestataireRepository {
    Prestataire[] getAllByPrestation(Prestation prestation);
    Prestataire findById(int idPrestataire);
}
