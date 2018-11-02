package com.chengxiaoxiao.controller;

import com.chengxiaoxiao.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @ClassName: StudentController
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2018-11-02
 */
@Controller
@RequestMapping("/student")
public class StudentController extends BaseController {
    @RequestMapping("/show")
    public String show(Model model) {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("做全栈攻城狮");
        stu.setAge(18);
        stu.setGender(1);
        stu.setBirthday(new Date());
        model.addAttribute("student", stu);
        return "studentshow";
    }

    /**
     * 限制使用GET方法提交
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editStudent(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "studentEdit";
    }

    @RequestMapping("/insert")
    public String insertStudent(Student student) {


        return "studentInsert";
    }

}
