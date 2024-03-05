package br.com.fiap.BudgetBuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.BudgetBuddy.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
