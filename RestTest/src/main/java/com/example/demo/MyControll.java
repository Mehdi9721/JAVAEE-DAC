package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyControll {
     
	@Autowired
	UserRepo ur;
	
	@GetMapping("/")
	public String ho() {
		System.out.println("mapping....");
		return "me.jsp";
	}
	 
	@GetMapping("/save")
	public String save(@ModelAttribute("result") Emp e) {
		ur.save(e);
			return "result.jsp";
	}
	
	@GetMapping("/find")
	@ResponseBody
	public List<Emp> find(Model m) {
		m.addAttribute("all", ur.findAll());
		List<Emp> res=ur.findAll();
			return res;
	}
	
	@GetMapping("/find/{id}")
	@ResponseBody
	public Optional<Emp> findOne(@PathVariable int id) {
	Optional<Emp>	res=ur.findById(id);
			return res;
	}
	
}
