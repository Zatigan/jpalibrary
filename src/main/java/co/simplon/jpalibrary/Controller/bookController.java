package co.simplon.jpalibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.simplon.jpalibrary.Service.bookService;

@Controller
public class bookController {

 @Autowired
 private bookService bookService;
}
