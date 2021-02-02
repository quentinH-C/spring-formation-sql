package formation.id.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.id.backend.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{

	public List<Formation> findByTitre(String titre);
	public List<Formation> findByDescription(String description);
	public List<Formation> findByDescriptionOrTitre(String description, String titre);
	
}
