package com.Tasini.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tasini.Domain.Cliente;
import com.Tasini.Repository.ClienteRepo;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepo clienteRepo;

    public List<Cliente> getAll() {
        return clienteRepo.findAll();
    }

    public Optional<Cliente> getById(Long id) {
        return clienteRepo.findById(id);
    }

    public Cliente saveOrUpdate(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public void deleteById(Long id) {
        clienteRepo.deleteById(id);
    }

    public void deleteAll() {
        clienteRepo.deleteAll();
    }

    public List<Cliente> GetClientiAfterDate(LocalDate date){
        List<Cliente> clienti = clienteRepo.findAll();
        for (Cliente cliente : clienti) {
            if (cliente.getData_utlimo_acquisto().isBefore(date)) {
                clienti.remove(cliente);
            }
        }
        return clienti;
        
    }

    
    
}
