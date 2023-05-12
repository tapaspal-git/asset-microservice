package com.example.microservices.asset.assetmicroservice.service;

import com.example.microservices.asset.assetmicroservice.bean.Asset;
import com.example.microservices.asset.assetmicroservice.dao.AssetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssetService {
    @Autowired
    AssetDao assetDao;

    public List<Asset> getAssetService(List<Integer> assetId){
        List<Asset> assetIDs = assetDao.findByAssetidIn(assetId).stream().map(asset ->
                new Asset("Item", asset.getName(), asset.getItemmodel()))
                .collect(Collectors.toList());
        return assetIDs;
    }
}
