package com.chengxiaoxiao.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: BaseController
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-11-02
 */
public class BaseController {

    /**
     * 统一进行日期格式的转换
     * @param request
     * @param binder
     * @throws Exception
     */
    @InitBinder
    public void initBinder(HttpServletRequest request,
                           ServletRequestDataBinder binder) throws Exception {
        //将student类中的birthday属性进行日期转换，类型和birthday一致
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
