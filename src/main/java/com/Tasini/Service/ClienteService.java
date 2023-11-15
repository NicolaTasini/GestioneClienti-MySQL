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

    public Optional<Cliente> saveOrUpdate(Cliente cliente) {
        clienteRepo.save(cliente);
        Optional<Cliente> opt = Optional.of(cliente);
        return opt;
    }

    public void deleteById(Long id) {
        clienteRepo.deleteById(id);
    }

    public void deleteAll() {
        clienteRepo.deleteAll();
    }  

    
}
