package com.slicrofinance.serviceImpl;

import com.slicrofinance.models.Client;
import com.slicrofinance.repositories.ClientRepo;
import com.slicrofinance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public List<Client> getAllClientList() {
        return (List<Client>) clientRepo.findAll();
    }

    @Override
    public Client updateClient(Client client, Long id) {
        Client clientDB = clientRepo.findById(id).get();
        if (Objects.nonNull(client.getName()) && !"".equalsIgnoreCase(client.getName())) {
            clientDB.setName(client.getName());
        }
        if (Objects.nonNull(client.getCity()) && !"".equalsIgnoreCase(client.getCity())) {
            clientDB.setCity(client.getCity());
        }
        if (Objects.nonNull(client.getDob()) && !"".equalsIgnoreCase(client.getDob().toString())) {
            clientDB.setDob(client.getDob());
        }
        if (Objects.nonNull(client.getName()) && !"".equalsIgnoreCase(client.getName())) {
            clientDB.setName(client.getName());
        }
        if (Objects.nonNull(client.getEducation()) && !"".equalsIgnoreCase(client.getEducation())) {
            clientDB.setEducation(client.getEducation());
        }if (Objects.nonNull(client.getFatherName()) && !"".equalsIgnoreCase(client.getFatherName())) {
            clientDB.setFatherName(client.getFatherName());
        }
        if (Objects.nonNull(client.getGender()) && !"".equalsIgnoreCase(client.getGender())) {
            clientDB.setGender(client.getGender());
        }
        if (Objects.nonNull(client.getMaritalStatus()) && !"".equalsIgnoreCase(client.getMaritalStatus())) {
            clientDB.setMaritalStatus(client.getMaritalStatus());
        }
        if (Objects.nonNull(client.getOccupation()) && !"".equalsIgnoreCase(client.getOccupation())) {
            clientDB.setOccupation(client.getOccupation());
        }
        if (Objects.nonNull(client.getPanCard()) && !"".equalsIgnoreCase(client.getPanCard())) {
            clientDB.setPanCard(client.getPanCard());
        }
        if (Objects.nonNull(client.getPresentAddress()) && !"".equalsIgnoreCase(client.getPresentAddress())) {
            clientDB.setPresentAddress(client.getPresentAddress());
        }
        if (Objects.nonNull(client.getReligion()) && !"".equalsIgnoreCase(client.getReligion())) {
            clientDB.setReligion(client.getReligion());
        }
        if (Objects.nonNull(client.getAadharCard()) && !"".equalsIgnoreCase(client.getAadharCard())) {
            clientDB.setAadharCard(client.getAadharCard());
        }
        if (Objects.nonNull(client.getPhoneNo()) && !"".equalsIgnoreCase(client.getPhoneNo())) {
            clientDB.setPhoneNo(client.getPhoneNo());
        }
        if (Objects.nonNull(client.getPinCode()) && !"".equalsIgnoreCase(client.getPinCode())) {
            clientDB.setPinCode(client.getPinCode());
        }


        return clientRepo.save(clientDB);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepo.deleteById(id);
    }


}
