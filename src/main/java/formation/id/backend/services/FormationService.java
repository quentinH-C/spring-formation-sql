package formation.id.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.id.backend.entities.Formation;
import formation.id.backend.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;

	public <S extends Formation> S save(S entity) {
		return repository.save(entity);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}
	
	public List<Formation> findByTitre(String titre){
		return repository.findByTitre(titre);
	}
	
	public Formation findById(Long id){
		return repository.findById(id)
				.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public List<Formation> findByDescription(String description) {
		return repository.findByDescription(description);
	}
	
}
