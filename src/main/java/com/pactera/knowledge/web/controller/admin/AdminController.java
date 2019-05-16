package com.pactera.knowledge.web.controller.admin;

import java.io.File;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pactera.knowledge.base.ApiResponse;

@RestController
public class AdminController {
    /**
     * 后台管理中心
     * @return
     */
    @GetMapping("/admin/center")
    public ModelAndView adminCenterPage() {
        return new ModelAndView("admin/center");
    }

    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/admin/welcome")
    public ModelAndView welcomePage() {
        return new ModelAndView("admin/welcome");
    }

    /**
     * 管理员登录页
     * @return
     */
    @GetMapping("/admin/login")
    public ModelAndView adminLoginPage() {
        return new ModelAndView("admin/login");
    }
    
    /**
     * 房源列表页
     * @return
     */
    @GetMapping("admin/house/list")
    public ModelAndView houseListPage() {
        return new ModelAndView("admin/house-list");
    }

//    @PostMapping("admin/houses")
//    @ResponseBody
//    public ApiDataTableResponse houses(@ModelAttribute DatatableSearch searchBody) {
//        ServiceMultiResult<HouseDTO> result = houseService.adminQuery(searchBody);
//
//        ApiDataTableResponse response = new ApiDataTableResponse(ApiResponse.Status.SUCCESS);
//        response.setData(result.getResult());
//        response.setRecordsFiltered(result.getTotal());
//        response.setRecordsTotal(result.getTotal());
//
//        response.setDraw(searchBody.getDraw());
//        return response;
//    }

    /**
     * 新增房源功能页
     * @return
     */
    @GetMapping("admin/add/house")
    public ModelAndView addHousePage() {
        return new ModelAndView("admin/house-add");
    }
    
    /**
     * 上传图片接口
     * @param file
     * @return
     */
    @PostMapping(value = "admin/upload/photo", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public ApiResponse uploadPhoto(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ApiResponse.ofStatus(ApiResponse.Status.NOT_VALID_PARAM);
        }

        String fileName = file.getOriginalFilename();
        File target= new File(fileName);
        try {
			file.transferTo(target);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ApiResponse.ofStatus(ApiResponse.Status.INTERNAL_SERVER_ERROR);
		}
        return ApiResponse.ofSuccess("AAAAAAA");
    }
}

