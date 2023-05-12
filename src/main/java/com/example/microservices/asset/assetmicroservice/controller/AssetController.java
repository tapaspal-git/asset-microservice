package com.example.microservices.asset.assetmicroservice.controller;

import com.example.microservices.asset.assetmicroservice.bean.Asset;
import com.example.microservices.asset.assetmicroservice.bean.AssetRequestBody;
import com.example.microservices.asset.assetmicroservice.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AssetController {

    @Autowired
    AssetService assetService;

    @PostMapping("/getAsset")
    public List<Asset> getAssetByAssetId(@RequestBody AssetRequestBody assetList){

        return assetService.getAssetService(assetList.getAssetList());
    }
}
