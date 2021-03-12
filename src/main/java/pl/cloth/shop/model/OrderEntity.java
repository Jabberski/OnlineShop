package pl.cloth.shop.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class OrderEntity extends ParentEntity{


    private Long orderNumber;
    @OneToMany
    private List<ItemEntity> items;
}
