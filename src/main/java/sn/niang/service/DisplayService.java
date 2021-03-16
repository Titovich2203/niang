package sn.niang.service;

import sn.niang.domain.Prestataire;
import sn.niang.domain.Prestation;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeServices(Prestation[] prestations);

    void afficherPrestataires(Prestation prestation, Prestataire[] prestataires);

    void afficherDetailsPrestation();

    void afficherDetailsContrat();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
