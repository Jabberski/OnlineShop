package pl.cloth.shop.service;


import pl.cloth.shop.model.ItemEntity;
import pl.cloth.shop.repository.ItemEntityRepository;

import java.util.List;

public class ItemEntityServiceImpl implements ItemEntityService {

    private ItemEntityRepository itemEntityRepository;

    @Override
    public List<ItemEntity> getListOfItems() {
        return itemEntityRepository.findAll();
    }
}
