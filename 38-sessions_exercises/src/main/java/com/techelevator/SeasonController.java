package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@RequestMapping("/FavThingsApp/")
@SessionAttributes("user1")
public class SeasonController {
	
	@RequestMapping(path="/seasonInput", method=RequestMethod.POST)
	public String processSeason(@RequestParam String season,
								ModelMap model) {
			FavThingsApp fav = (FavThingsApp)model.get("user1");
			fav.setSeason(season);
			return "redirect:/FavThingsApp/summary";
	}
	
	@RequestMapping("/summary")
	public String displaySummary() {
		return "FavThingsApp/summary";
	}
	
}