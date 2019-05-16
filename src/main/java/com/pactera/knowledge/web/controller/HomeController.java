package com.pactera.knowledge.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pactera.knowledge.base.ApiResponse;

@RestController
public class HomeController {
	@GetMapping(value= {"/","index"})
	public ModelAndView index(Model model) {
		return new ModelAndView("index");
	}
	
	@GetMapping("/test")
	public ApiResponse test() {
		return ApiResponse.ofMessage(200, "AAAAAAA");
	}
	
	@GetMapping("/404")
    public ModelAndView notFoundPage() {
        return new ModelAndView("404");
    }

    @GetMapping("/403")
    public ModelAndView accessError() {
        return new ModelAndView("403");
    }

    @GetMapping("/500")
    public ModelAndView internalError() {
        return new ModelAndView("500");
    }

    @GetMapping("/logout/page")
    public ModelAndView logoutPage() {
        return new ModelAndView("logout");
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
