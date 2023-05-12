package com.example.microservices.asset.assetmicroservice.dao;

import com.example.microservices.asset.assetmicroservice.bean.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetDao extends JpaRepository<Asset, List<Integer>> {

    List<Asset> findByAssetidIn(List<Integer> id);
}
