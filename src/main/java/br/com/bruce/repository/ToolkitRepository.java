package br.com.bruce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bruce.entity.ToolkitEntity;

@Repository
public interface ToolkitRepository extends JpaRepository<ToolkitEntity, Long>{
	public Optional<ToolkitEntity> findToolkitByName(String name);
}