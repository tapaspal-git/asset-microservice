package com.example.microservices.asset.assetmicroservice.bean;

import java.io.Serializable;
import java.util.List;

public class AssetRequestBody  implements Serializable {

    private List<Integer> assetList;

    public List<Integer> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<Integer> assetList) {
        this.assetList = assetList;
    }

    public AssetRequestBody(List<Integer> assetList) {
        this.assetList = assetList;
    }

    public AssetRequestBody() {
    }
}
