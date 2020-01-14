package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/image-tag")

	public String toImageTag() {
		return "ImageTag";
	}

	@RequestMapping("/paragraph-tag")

	public String toParagraphTag() {
		return "ParagraphTag";
	}

	@RequestMapping("/table")

	public String toTables() {
		return "TableTag";
	}

	@RequestMapping("/orderedlist")

	public String toOrderedList() {
		return "OrderedListTag";
	}

	@RequestMapping("/unorderedlist")

	public String toUnorderedList() {
		return "UnorderedList";
	}

	@RequestMapping("/input")

	public String toInputTag() {
		return "InputTag";
	}
}
