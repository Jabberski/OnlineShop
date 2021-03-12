package pl.cloth.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cloth.shop.model.user.UserDetailsEntity;

@Repository
public interface UserDetailsEntityRepository extends JpaRepository<UserDetailsEntity,Long> {
}
