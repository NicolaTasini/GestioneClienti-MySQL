package com.Tasini.Controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.hibernate.mapping.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Tasini.Domain.Cliente;
import com.Tasini.Service.ClienteService;

@Controller
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        return ResponseEntity.ok().body(clienteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id) {
        Optional opt = clienteService.getById(id);
        if (opt.isPresent()) {
            return ResponseEntity.ok().body((Cliente) opt.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> saveOrUpdate(Cliente cliente) {
        return ResponseEntity.ok().body(clienteService.saveOrUpdate(cliente));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Cliente> deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //@GetMapping("/getAfterDate/{date}")


}
