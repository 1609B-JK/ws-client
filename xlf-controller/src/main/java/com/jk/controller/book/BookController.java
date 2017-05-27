package com.jk.controller.book;
import com.jk.ws.WSBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lynn-F_X on 2017/5/26.
 */
@Controller
@RequestMapping("/book/")
public class BookController {

    @Autowired
    private WSBookService wsBookService;

    @RequestMapping("test1")
    public void test1() {
        wsBookService.theFirstMethod();
    }

    @RequestMapping("test3")
    public void test3(String name) {
        String  a = wsBookService.test3(name);
        System.out.println(a);
    }

    @RequestMapping("test4")
    public void test4() {
        int aa = wsBookService.test2();
        System.out.println(aa);
    }

}

