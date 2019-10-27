package com.hjd.item.controller;

import com.hjd.common.pojo.PageResult;
import com.hjd.item.pojo.Brand;
import com.hjd.item.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandController {

    /**
     * 根据查询条件分页并排序查询品牌信息
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    @Autowired
    private IBrandService iBrandService;
    @GetMapping("/page")
    public ResponseEntity<PageResult<Brand>> queryBrandsByPage(
            @RequestParam(value = "key", required = false)String key,
            @RequestParam(value = "page", defaultValue = "1")Integer page,
            @RequestParam(value = "rows", defaultValue = "5")Integer rows,
            @RequestParam(value = "sortBy", required = false)String sortBy,
            @RequestParam(value = "desc", required = false)Boolean desc){
        PageResult<Brand> brandPageResult = iBrandService.queryBrandsByPage(key, page, rows, sortBy, desc);
        return ResponseEntity.ok(brandPageResult);
    }
    @Transactional
    @PostMapping
    public ResponseEntity<Void> savaBrand(Brand brand, @RequestParam("cids") List<Long> cids){
        iBrandService.savaBrand(brand,cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
