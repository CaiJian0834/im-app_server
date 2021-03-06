package cn.wildfirechat.app.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface ShiroSessionRepository extends CrudRepository<ShiroSession, String> {
}
