package com.ciemiorek.SpringDemoNieruchomosci.utils;


import com.ciemiorek.SpringDemoNieruchomosci.models.City;
import com.ciemiorek.SpringDemoNieruchomosci.models.Client;
import com.ciemiorek.SpringDemoNieruchomosci.models.HomeType;
import com.ciemiorek.SpringDemoNieruchomosci.models.Offer;
import com.ciemiorek.SpringDemoNieruchomosci.repositories.ClientRepository;
import com.ciemiorek.SpringDemoNieruchomosci.repositories.OfferRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrap {

   private OfferRepository offerRepository;
   private ClientRepository clientRepository;

    public BootStrap(OfferRepository offerRepository, ClientRepository clientRepository) {
        this.offerRepository = offerRepository;
        this.clientRepository = clientRepository;
    }

    public void initializeRepository() {

        Client client1 = Client.of("Jan","KOwalski");
        Client client2 = Client.of("Adam","Nowak");

        clientRepository.add(client1);
        clientRepository.add(client2);

        Offer offer1 = Offer.of(client1, HomeType.HOUSE, City.WARSZAWA,"Testowa 1",120,6);
        Offer offer2 = Offer.of(client1, HomeType.FLAT, City.WARSZAWA,"Testowa 10",20,3);
        Offer offer3 = Offer.of(client2, HomeType.HOUSE, City.KATOWICE,"Testowa 10",1200,4);
        Offer offer4 = Offer.of(client2, HomeType.APARTAMENT, City.KRAKOW,"Testowa 12",40,1);

        offerRepository.add(offer1);
        offerRepository.add(offer2);
        offerRepository.add(offer3);
        offerRepository.add(offer4);

    }
}
