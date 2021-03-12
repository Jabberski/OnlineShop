package pl.cloth.shop.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cloth.shop.model.OrderEntity;

@Repository
public interface OrderEntityRepository extends JpaRepository<OrderEntity, Long> {
}
