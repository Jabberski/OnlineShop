package pl.cloth.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cloth.shop.model.CategoryEntity;

@Repository
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Long> {
}
