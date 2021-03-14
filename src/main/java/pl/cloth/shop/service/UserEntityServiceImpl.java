package pl.cloth.shop.service;

import org.springframework.stereotype.Service;
import pl.cloth.shop.repository.UserEntityRepository;

@Service
public class UserEntityServiceImpl implements UserEntityService{

    private UserEntityRepository userEntityRepository;

    @Override
    public void deleteUser(Long id) {
        userEntityRepository.deleteById(id);
    }
}
