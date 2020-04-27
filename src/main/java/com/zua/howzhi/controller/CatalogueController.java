package com.zua.howzhi.controller;

import com.zua.howzhi.model.Catalogue;
import com.zua.howzhi.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author Hengzhi
 * @Create 2020-03-27 11:27
 */
@Controller
@RequestMapping("/catalogue")
public class CatalogueController {
    @Autowired
    private CatalogueService catalogueService;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/selectById")
    public Catalogue selectById(@RequestParam Integer catalogueId) {
        return catalogueService.selectById(catalogueId);
    }
//    @CrossOrigin
//    @ResponseBody
//    @RequestMapping("/selectByCourse")
//    public Catalogue selectById(@RequestParam Integer courseId) {
//        return catalogueService.selectById(catalogueId);
//    }
}
