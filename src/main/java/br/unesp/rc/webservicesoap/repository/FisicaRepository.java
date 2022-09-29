package br.unesp.rc.webservicesoap.repository;

import br.unesp.rc.webservicesoap.entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface FisicaRepository extends JpaRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);    

}
