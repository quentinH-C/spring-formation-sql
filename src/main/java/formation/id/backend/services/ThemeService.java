package formation.id.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.id.backend.entities.Theme;
import formation.id.backend.repositories.ThemeRepository;

@Service
public class ThemeService {
	@Autowired
	private ThemeRepository repository;

	public <S extends Theme> S save(S entity) {
		return repository.save(entity);
	}

	public List<Theme> findAll() {
		return repository.findAll();
	}

	public Theme findById(Long id) {
		return repository.findById(id)
				.orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
}
