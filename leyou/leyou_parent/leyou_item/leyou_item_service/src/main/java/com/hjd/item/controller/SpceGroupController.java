package com.hjd.item.controller;

import com.hjd.item.pojo.SpecGroup;
import com.hjd.item.service.ISpceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/spec")
public class SpceGroupController {
    @Autowired
    private ISpceGroupService iSpceGroupService;
    @GetMapping("/groups/{cid}")
    public ResponseEntity<List<SpecGroup>>queryGroupsByCid(@PathVariable("cid") Long cid){
        List<SpecGroup> specGroups=iSpceGroupService.queryGroupsByCid(cid);
        if (CollectionUtils.isEmpty(specGroups)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(specGroups);
    }
}
