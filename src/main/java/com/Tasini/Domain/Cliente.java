package com.Tasini.Domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "clienti")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    String nominativo;
    String indirizzo;
    String codice_fiscale;
    LocalDate data_nascita;
    BigDecimal fatturato;
    LocalDate data_utlimo_acquisto;

    public Cliente() {
    }

    public Cliente(Long id, String nominativo, String indirizzo, String codice_fiscale, LocalDate data_nascita, BigDecimal fatturato, LocalDate data_utlimo_acquisto) {
        this.id = id;
        this.nominativo = nominativo;
        this.indirizzo = indirizzo;
        this.codice_fiscale = codice_fiscale;
        this.data_nascita = data_nascita;
        this.fatturato = fatturato;
        this.data_utlimo_acquisto = data_utlimo_acquisto;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNominativo() {
        return this.nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCodice_fiscale() {
        return this.codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public LocalDate getData_nascita() {
        return this.data_nascita;
    }

    public void setData_nascita(LocalDate data_nascita) {
        this.data_nascita = data_nascita;
    }

    public BigDecimal getFatturato() {
        return this.fatturato;
    }

    public void setFatturato(BigDecimal fatturato) {
        this.fatturato = fatturato;
    }

    public LocalDate getData_utlimo_acquisto() {
        return this.data_utlimo_acquisto;
    }

    public void setData_utlimo_acquisto(LocalDate data_utlimo_acquisto) {
        this.data_utlimo_acquisto = data_utlimo_acquisto;
    }

    public Cliente id(Long id) {
        setId(id);
        return this;
    }

    public Cliente nominativo(String nominativo) {
        setNominativo(nominativo);
        return this;
    }

    public Cliente indirizzo(String indirizzo) {
        setIndirizzo(indirizzo);
        return this;
    }

    public Cliente codice_fiscale(String codice_fiscale) {
        setCodice_fiscale(codice_fiscale);
        return this;
    }

    public Cliente data_nascita(LocalDate data_nascita) {
        setData_nascita(data_nascita);
        return this;
    }

    public Cliente fatturato(BigDecimal fatturato) {
        setFatturato(fatturato);
        return this;
    }

    public Cliente data_utlimo_acquisto(LocalDate data_utlimo_acquisto) {
        setData_utlimo_acquisto(data_utlimo_acquisto);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nominativo='" + getNominativo() + "'" +
            ", indirizzo='" + getIndirizzo() + "'" +
            ", codice_fiscale='" + getCodice_fiscale() + "'" +
            ", data_nascita='" + getData_nascita() + "'" +
            ", fatturato='" + getFatturato() + "'" +
            ", data_utlimo_acquisto='" + getData_utlimo_acquisto() + "'" +
            "}";
    }
}
