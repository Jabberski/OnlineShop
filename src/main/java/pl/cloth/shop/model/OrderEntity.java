package pl.cloth.shop.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity extends ParentEntity{


    private Long orderNumber;
    @OneToMany
    private List<ItemEntity> items;
}
