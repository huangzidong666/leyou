package com.hjd.item.service.impl;

import com.hjd.item.mapper.ISpecGroupMapper;
import com.hjd.item.pojo.SpecGroup;
import com.hjd.item.service.ISpceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpceGroupService implements ISpceGroupService {
    @Autowired
    private ISpecGroupMapper iSpecGroupMapper;
    @Override
    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        List<SpecGroup> specGroups = iSpecGroupMapper.select(specGroup);
        return specGroups;
    }
}
