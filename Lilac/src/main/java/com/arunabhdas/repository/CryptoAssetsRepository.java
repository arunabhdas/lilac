package com.arunabhdas.repository;

import com.arunabhdas.model.CryptoAsset;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CryptoAssetsRepository implements CrudRepository<CryptoAsset>{
    private List<CryptoAsset> cryptoAssets;
    @Override
    public List findAll() {
        cryptoAssets = new ArrayList<>();
        CryptoAsset cryptoAsset = new CryptoAsset(1,
                "Bitcoin",
                "BTC",
                "https://coinmarketcap.com/currencies/bitcoin/");
        cryptoAssets.add(cryptoAsset);
        return cryptoAssets;
    }
}
