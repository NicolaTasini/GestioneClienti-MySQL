INSERT INTO clienti(id, nominativo, indirizzo, codice_fiscale, data_nascita, fatturato, data_utlimo_acquisto)
 VALUES 
    (1, 'nom1', 'indirizzo1', 'codice_fiscale1', '2000-01-01', 21412, NOW()),
    (2, 'nom2', 'indirizzo2', 'codice_fiscale2', '2000-02-02', 22422, NOW()),
    (3, 'nom3', 'indirizzo3', 'codice_fiscale3', '2000-03-03', 23432, NOW()),
    (4, 'nom4', 'indirizzo4', 'codice_fiscale4', '2000-04-01', 21412, NOW());


    /*
    String nominativo;
    String indirizzo;
    String codice_fiscale;
    LocalDate data_nascita;
    BigDecimal fatturato;
    LocalDate data_utlimo_acquisto; */