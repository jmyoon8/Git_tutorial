@controller
public class UserController {

	//로그인 페이지
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로:login");

		return "/user/login";
	}
	//회원추가 페이지로이동
	@RequestMapping("/user/insert.do")
	public String login(){
		
		return"/user/insert";
	}

	//회원정보 수정 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update(){
		
		return"/user/update";
	}


}  