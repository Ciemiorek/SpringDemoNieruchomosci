package com.ciemiorek.SpringDemoNieruchomosci.controllers;

import com.ciemiorek.SpringDemoNieruchomosci.models.Offer;
import com.ciemiorek.SpringDemoNieruchomosci.services.OfferService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/offer")
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService){
        this.offerService =offerService;
    }

    @GetMapping("")
    public List<Offer> getOffers(){

        return offerService.getAll();
    }

    @GetMapping("/{id}")
    public Offer getOffer(@PathVariable("id") int id){

        return offerService.get(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Offer createOffer(@RequestBody Offer offer){

        return offerService.create(offer);
    }
    @PostMapping("/{id}")
    public Offer updateOffer(@PathVariable("id") int id, @RequestBody Offer offer){

        return offerService.update(id, offer);
    }


    @DeleteMapping("/{id}")
    public String  deleteClient(@PathVariable("id") int id){

        offerService.delete(id);
        return "OK";
    }
}
