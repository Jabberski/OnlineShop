package pl.cloth.shop.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemEntity extends ParentEntity{

    @ManyToOne
    private CategoryEntity category;

}
