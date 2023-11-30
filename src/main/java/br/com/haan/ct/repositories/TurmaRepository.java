package br.com.haan.ct.repositories;


import br.com.haan.ct.entities.Turma;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TurmaRepository extends CrudRepository<Turma,Long >{
    @Query(value="SELECT local, COUNT(*) AS quantidade FROM turma GROUP BY local;")
    public Iterable<Turma> listarControleOcupacao();
}
