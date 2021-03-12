package pl.cloth.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cloth.shop.model.ItemEntity;

@Repository
public interface ItemEntityRepository extends JpaRepository<ItemEntity, Long> {
}
