package com.Tasini.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tasini.Domain.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Long> {


}
