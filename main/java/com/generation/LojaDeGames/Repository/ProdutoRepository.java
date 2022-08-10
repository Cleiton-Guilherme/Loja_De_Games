package com.generation.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoRepository, Long> {
	
	public List<ProdutoRepository> findAllNameIgnoreCaseContaining(String produto);

}
