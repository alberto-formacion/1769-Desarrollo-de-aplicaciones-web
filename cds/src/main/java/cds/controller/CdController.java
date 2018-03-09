package cds.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cds.service.CdService;
import cds.vo.Cd;

@Controller
@RequestMapping("/cds")
//@SessionAttributes(names={"cds"})
public class CdController {
	
	@Autowired
	CdService cdService;
	
	@GetMapping
	public String home(ModelMap model) {
		List<Cd> cds = cdService.getCds();
		
		model.addAttribute("cds", cds);
		model.addAttribute("cd", new Cd());
		
		return "index";
	}
	
	@PostMapping
	public String addCd(ModelMap model, Cd cd) {
		cdService.addCd(cd);
		
		List<Cd> cds = cdService.getCds();
		
		model.addAttribute("cds", cds);
		model.addAttribute("cd", new Cd());
		
		return "index";
	}

}
