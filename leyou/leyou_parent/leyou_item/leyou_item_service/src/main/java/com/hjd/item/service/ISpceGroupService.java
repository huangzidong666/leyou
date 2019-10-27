package com.hjd.item.service;

import com.hjd.item.pojo.SpecGroup;

import java.util.List;

public interface ISpceGroupService {

    List<SpecGroup> queryGroupsByCid(Long cid);
}
