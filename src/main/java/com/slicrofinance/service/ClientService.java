package com.slicrofinance.service;


import com.slicrofinance.models.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    List<Client> getAllClientList();

    Client updateClient(Client client, Long id);

    void deleteClientById(Long id);
}
