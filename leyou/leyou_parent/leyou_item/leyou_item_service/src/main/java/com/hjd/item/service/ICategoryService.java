package com.hjd.item.service;

import com.hjd.item.pojo.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> queryCategoriesByPid(Long pid);
}
