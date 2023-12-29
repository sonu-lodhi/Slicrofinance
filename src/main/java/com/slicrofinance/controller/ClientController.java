package com.slicrofinance.controller;

import com.slicrofinance.models.Client;
import com.slicrofinance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveClient")
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateClient/{id}")
    public Client updateClient(@RequestBody Client client, @PathVariable("id") Long id){
        return clientService.updateClient(client, id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Client> listAllClient(){
        return clientService.getAllClientList();
    }



    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteClients/{id}")
    public String deleteClientById(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
        return "Deleted Successfully";
    }
}
