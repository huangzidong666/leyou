package com.hjd.item.service;

import com.hjd.common.pojo.PageResult;
import com.hjd.item.pojo.Brand;

import java.util.List;

public interface IBrandService {
    public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);

    boolean savaBrand(Brand brand, List<Long> cids);
}
