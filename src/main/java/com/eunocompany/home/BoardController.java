package com.eunocompany.home;
//안만들어서 404뜰건데 콘솔창 확인해보면 잘 들어왔을거임
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@RequestMapping(value="/list")
	public String list() {
		System.out.println("리스트 요청 체크");
		
		return "list";
	}
	@RequestMapping(value="/reply")
	public String reply() {
		return "reply";
	}
	@RequestMapping(value="/file")
	public String file() {
		return "file";
	}
}
