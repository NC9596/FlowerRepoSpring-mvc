package com.softtek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.entity.Flower;
import com.softtek.service.FlowerService;

@Controller
public class FlowerController {

	@Autowired
	private FlowerService service;

	// show welcome page
		@GetMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	// show register page
	@GetMapping("/reg")
	public String showReg(Model map) {
		// form baking object
		map.addAttribute("objOfFlower", new Flower());
		return "register";
	}

	// save objectOfFlower
	@PostMapping("/save")
	public String saveFlower(Flower objectOfFlower, Model map) {
		Integer id = service.saveFlower(objectOfFlower);
		map.addAttribute("msg", "Flower [" + id + "] added successfully");

		// clear form baking object
		map.addAttribute("objOfFlower", new Flower());

		return "register";
	}

	// get all objectOfCustomer
	@GetMapping("/all")
	public String showFlower(Model map) {
		List<Flower> list = service.getAllFlowers();
		map.addAttribute("list", list);
		return "data";
	}

	// getOne objectOfFlower for view page
	@GetMapping("/view")
	public String getOneFlower(@RequestParam int id, Model map) {
		Flower objectOfFlowergt = service.getOneFlower(id);
		if (objectOfFlowergt != null) {
			map.addAttribute("objOfFlower", objectOfFlowergt);
		} else {
			map.addAttribute("msg", "No Flower Found");
		}

		return "view";
	}

	// delete objectOfFlower
	@GetMapping("/delete")
	public String deleteFlower(@RequestParam Integer id, Model map) {
		service.deleteFlower(id);
		map.addAttribute("msg", "Flower deleted Successfully");
		return "redirect:all";
	}

	// get Update objectOfFlower
	@GetMapping("/getUpdate")
	public String getUpdateFlowerPage(@RequestParam Integer id, Model map) {
		map.addAttribute("objOfFlower", service.getOneFlower(id));
		map.addAttribute("mode", "edit");
		return "register";
	}

	// update objectOfFlower
	@PutMapping("/update")
	public String updateFlower(@ModelAttribute Flower objectOfFlowerupP, Model map) {
		Flower objectOfFlowerupA = service.updateFlower(objectOfFlowerupP);
		map.addAttribute("msg", "Flower updated successfully");

		// clear form baking object 
		map.addAttribute("objOfFlower",new Flower());
		return "redirect:view?id=" + objectOfFlowerupA.getid();
	}
	
	@PostMapping("/error")
	public String showError() {
		return "error";
}
	
}
