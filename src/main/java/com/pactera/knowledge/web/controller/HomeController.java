package com.pactera.knowledge.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pactera.knowledge.base.ApiResponse;

@Controller
public class HomeController {
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "welcome");
		return "index";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public ApiResponse test() {
		return ApiResponse.ofMessage(200, "AAAAAAA");
	}
	
	@GetMapping("/404")
    public String notFoundPage() {
        return "404";
    }

    @GetMapping("/403")
    public String accessError() {
        return "403";
    }

    @GetMapping("/500")
    public String internalError() {
        return "500";
    }

    @GetMapping("/logout/page")
    public String logoutPage() {
        return "logout";
    }

//    @GetMapping(value = "sms/code")
//    @ResponseBody
//    public ApiResponse smsCode(@RequestParam("telephone") String telephone) {
//        if (!LoginUserUtil.checkTelephone(telephone)) {
//            return ApiResponse.ofMessage(HttpStatus.BAD_REQUEST.value(), "请输入正确的手机号");
//        }
//        ServiceResult<String> result = smsService.sendSms(telephone);
//        if (result.isSuccess()) {
//            return ApiResponse.ofSuccess("");
//        } else {
//            return ApiResponse.ofMessage(HttpStatus.BAD_REQUEST.value(), result.getMessage());
//        }
//
//    }
}
