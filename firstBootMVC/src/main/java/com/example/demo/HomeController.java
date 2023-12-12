package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepo r;
	
@GetMapping("/")
public String  home() {
	System.out.println("home page....");
return "index.jsp";
}

@GetMapping("/stu")
public String sub(@ModelAttribute("stud") StudentModel s,Model m) {
	m.addAttribute("res", r.save(s));
	return "result.jsp";
}

@GetMapping("/getval")
public String data(@RequestParam int id, Model m) {
	
	m.addAttribute("data", r.findById(id));
	return "result.jsp";
}
@GetMapping("/getname")
public String name(@RequestParam("name")  String name, Model m){
	m.addAttribute("all", r.byName(name));
	return "result.jsp";
}

}
