package com.br.demo.carro;

import com.jayway.jsonpath.JsonPath;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {


    Page<Carro> findAllByAtivoTrue(Pageable paginacao);
}
