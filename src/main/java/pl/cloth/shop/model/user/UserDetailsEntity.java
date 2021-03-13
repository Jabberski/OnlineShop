package pl.cloth.shop.model.user;

import pl.cloth.shop.model.ParentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetailsEntity extends ParentEntity {

    @OneToOne
    private UserEntity user;
}
