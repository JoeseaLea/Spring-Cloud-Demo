package com.joesea.service.provider.controller;

import com.joesea.common.persistence.result.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2020/2/18</p>
 * <p>@description : </p>
 */
@RestController
@RequestMapping(value = "serviceProvider")
public class ServiceProviderController {

    @RequestMapping(value = "getJsonResult")
    public JsonResult getJsonResult() {
        JsonResult jsonResult = new JsonResult();

        jsonResult.success();

        return jsonResult;
    }
}
