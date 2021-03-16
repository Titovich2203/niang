package sn.niang.controller;

import sn.niang.repository.DetailPrestationRepository;
import sn.niang.repository.PrestataireRepository;
import sn.niang.repository.PrestationRepository;
import sn.niang.repository.jdbc.DataSource;
import sn.niang.repository.jdbc.JdbcBasedPrestationRepository;
import sn.niang.repository.jdbc.MysqlDataSource;
import sn.niang.repository.ram.ArrayBasedDetailPrestationRepository;
import sn.niang.repository.ram.ListBasedPrestataireRepository;
import sn.niang.service.DisplayService;
import sn.niang.service.MenuService;
import sn.niang.service.console.ConsoleDisplayService;
import sn.niang.service.console.ScannerMenuService;


/**
 * End point destiné aux clients
 * Deux fonctionnalités (services)
 * 1 - Afficher le menu au client : ConsoleDisplayService
 * 2 - Lire les choix du client et afficher le sous-menu correspondant : ScannerMenuService
 */
public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(){
        DetailPrestationRepository detailPrestationRepository = new ArrayBasedDetailPrestationRepository();
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService(detailPrestationRepository);
        PrestationRepository prestationRepository = new JdbcBasedPrestationRepository(dataSource);
        PrestataireRepository prestataireRepository = new ListBasedPrestataireRepository();
        scannerMenuService = new ScannerMenuService(displayService, prestationRepository, prestataireRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }


}
