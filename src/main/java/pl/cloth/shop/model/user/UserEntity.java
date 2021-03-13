package pl.cloth.shop.model.user;

import lombok.*;
import pl.cloth.shop.model.ParentEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity extends ParentEntity {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean enabled = Boolean.FALSE;
    private String authProvider;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "email", referencedColumnName = "email"))
    private Set<UserRoleEntity> roles = new HashSet<>();

}
