package com.arunabhdas.service;

import com.arunabhdas.model.CryptoAsset;
import com.arunabhdas.repository.CryptoAssetsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CryptoAssetsService implements CrudService<CryptoAsset> {

    private CryptoAssetsRepository repository;

    public CryptoAssetsService() {
        repository = new CryptoAssetsRepository();
    }

    @Override
    public List<CryptoAsset> list() {
        return repository.findAll();
    }

    @Override
    public CryptoAsset create(CryptoAsset cryptoAsset) {
        return null;
    }

    @Override
    public Optional<CryptoAsset> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(CryptoAsset cryptoAsset, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
