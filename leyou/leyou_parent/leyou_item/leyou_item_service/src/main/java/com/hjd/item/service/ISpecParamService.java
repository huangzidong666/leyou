package com.hjd.item.service;

import com.hjd.item.pojo.SpecParam;

import java.util.List;

public interface ISpecParamService {
    List<SpecParam> queryParamByGid(Long gid);
}
