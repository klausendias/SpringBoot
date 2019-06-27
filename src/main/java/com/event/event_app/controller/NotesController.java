package com.event.event_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class NotesController {

	//value is URL local host . api / v1 . notes
	@RequestMapping(value ="notes", method = RequestMethod.GET)
	public List<Note> list(){
		
	}
	
}
