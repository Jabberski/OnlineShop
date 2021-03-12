package pl.cloth.shop.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ItemEntity extends ParentEntity{

    @ManyToOne
    private CategoryEntity category;

}
