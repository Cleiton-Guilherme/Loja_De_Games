package com.generation.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<CategoriaRepository, Long>{
	
	public List<CategoriaRepository> findAllByCategoriaIgnoreCaseContaining(String categoria);

}
