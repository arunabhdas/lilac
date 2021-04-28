package com.arunabhdas.model;

public class CryptoAsset {
    private int cryptoAssetId;
    private String title;
    private String description;
    private String url;

    public CryptoAsset(int cryptoAssetId, String title, String description, String url) {
        this.cryptoAssetId = cryptoAssetId;
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public int getCryptoAssetId() {
        return cryptoAssetId;
    }

    public void setCryptoAssetId(int cryptoAssetId) {
        this.cryptoAssetId = cryptoAssetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CryptoAsset{" +
                "cryptoAssetId=" + cryptoAssetId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
