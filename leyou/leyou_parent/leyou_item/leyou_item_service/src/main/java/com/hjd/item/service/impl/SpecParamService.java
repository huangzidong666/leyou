package com.hjd.item.service.impl;

import com.hjd.item.mapper.ISpecParamMapper;
import com.hjd.item.pojo.SpecParam;
import com.hjd.item.service.ISpecParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecParamService implements ISpecParamService {
    @Autowired
    private ISpecParamMapper iSpecParamMapper;
    @Override
    public List<SpecParam> queryParamByGid(Long gid) {
        SpecParam specParam = new SpecParam();
        specParam.setGroupId(gid);
        List<SpecParam> specParams = iSpecParamMapper.select(specParam);
        return specParams;
    }
}
