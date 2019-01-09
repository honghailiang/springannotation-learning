package com.jtt.hhl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jtt.hhl.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

}
