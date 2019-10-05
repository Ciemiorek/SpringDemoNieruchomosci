package com.ciemiorek.SpringDemoNieruchomosci.services;

import com.ciemiorek.SpringDemoNieruchomosci.models.Client;
import com.ciemiorek.SpringDemoNieruchomosci.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {

    private  ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void delete(int id) {
        clientRepository.deleteById(id);
    }

    public Client update(int id, Client client) {
        return clientRepository.updateById(id,client);
    }

    public Client create(Client client) {
        return clientRepository.add(client);
    }

    public Client get(int id) {

        return clientRepository.findById(id);
    }

    public List<Client> getAll() {
        return  clientRepository.getAll();
    }
}
