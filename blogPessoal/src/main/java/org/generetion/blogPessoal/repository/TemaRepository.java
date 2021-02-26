package org.generetion.blogPessoal.repository;

import java.util.List;

import org.generetion.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository <Tema, Long>{

	public List<Tema> findAllByTituloContainingIgnoreCase (String titulo);
	
}
