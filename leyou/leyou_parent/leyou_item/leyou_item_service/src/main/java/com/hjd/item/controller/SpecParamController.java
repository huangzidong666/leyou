package com.hjd.item.controller;

import com.hjd.item.pojo.SpecParam;
import com.hjd.item.service.ISpecParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/spec")
public class SpecParamController {
    @Autowired
    private ISpecParamService iSpecParamService;
    @GetMapping("/params")
    public ResponseEntity<List<SpecParam>> queryParamByGid(@RequestParam("gid") Long gid){
        List<SpecParam> specParams=iSpecParamService.queryParamByGid(gid);
        return ResponseEntity.ok(specParams);
    }
}
