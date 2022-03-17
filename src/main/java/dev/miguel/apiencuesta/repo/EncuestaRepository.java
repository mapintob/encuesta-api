package dev.miguel.apiencuesta.repo;

import dev.miguel.apiencuesta.model.Encuesta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EncuestaRepository extends MongoRepository<Encuesta, String> {
}
