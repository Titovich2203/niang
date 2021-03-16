package sn.niang.repository.jdbc;

import sn.niang.domain.DetailPrestation;
import sn.niang.repository.DetailPrestationRepository;

public class JdbcBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll() {
        return new DetailPrestation[0];
    }
}
