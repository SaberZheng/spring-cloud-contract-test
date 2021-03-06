package com.ecut.test.controllers;

import com.ecut.test.entities.Author;
import com.ecut.test.entities.Page;
import com.ecut.test.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @author Amy
 * @date 2019-07-04 18:33
 * @description: 作者信息相关操作的controller，REST ful风格
 */
@Controller
@RequestMapping("/test")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public Page list() {
        Page page = new Page();
        List<Author> authors = authorService.listAuthors();
        page.setData(authors);
        return page;
    }

    /*@RequestMapping(value = "/authors", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("/list");
        List<Author> authors = authorService.listAuthors();
        model.addObject("authors", authors);
        return model;
    }*/

}
