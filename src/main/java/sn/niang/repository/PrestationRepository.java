package sn.niang.repository;

import sn.niang.domain.Prestation;

public interface PrestationRepository {
    Prestation[] getAll();
    Prestation getById(int id);
}
