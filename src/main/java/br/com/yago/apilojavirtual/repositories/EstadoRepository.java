package br.com.yago.apilojavirtual.repositories;

import br.com.yago.apilojavirtual.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}