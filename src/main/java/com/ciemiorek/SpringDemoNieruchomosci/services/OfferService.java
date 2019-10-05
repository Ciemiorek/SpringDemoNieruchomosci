package com.ciemiorek.SpringDemoNieruchomosci.services;

import com.ciemiorek.SpringDemoNieruchomosci.models.Offer;
import com.ciemiorek.SpringDemoNieruchomosci.repositories.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OfferService {

 private OfferRepository offerRepository;

    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public void delete(int id) {
        offerRepository.deleteById(id);
    }

    public Offer update(int id, Offer offer) {
    return offerRepository.updateById(id,offer);
    }

    public Offer get(int id) {

        return offerRepository.findById(id);
    }

    public List<Offer> getAll() {

        return offerRepository.getAll();
    }

    public Offer create(Offer offer) {

  return offerRepository.add(offer);

    }
}
