package com.hicetech.ucenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hicetech.ucenter.model.request.UserInfoRequest;
import com.hicetech.ucenter.model.request.UserLoginRequest;
import com.hicetech.ucenter.model.request.UserRegisterRequest;
import com.hicetech.ucenter.model.response.BaseResponse;
import com.hicetech.ucenter.model.response.RegisterResponseVo;
import com.hicetech.ucenter.service.ShortMessageService;
import com.hicetech.ucenter.service.UserService;

@RestController
@RequestMapping(value="ucenter/v2")
public class UserPersonalController {
	
	@Autowired
	private ShortMessageService shortMessageService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/verifcation/{type}/{mobileNum}",method = {RequestMethod.GET})
	public BaseResponse sendSMS(@PathVariable(value = "type")Integer type,
			@PathVariable(value = "mobileNum")String mobileNum){
		
		return shortMessageService.sendMSM(type,mobileNum);
	}
	
	@RequestMapping(value="/register",method={RequestMethod.PUT})
	public RegisterResponseVo registerUser(@RequestBody UserRegisterRequest register){
		
		return userService.createUser(register);
	}
	
	@RequestMapping(value="/login",method={RequestMethod.POST})
	public RegisterResponseVo loginUser(@RequestBody UserLoginRequest login){
		return userService.loginUser(login);
	}
	
	@RequestMapping(value="/password",method={RequestMethod.POST})
	public BaseResponse changePassword(@RequestBody UserRegisterRequest register){
		return userService.changePassword(register);
		
	}
	
	@RequestMapping(value="/logout/{token}",method={RequestMethod.POST})
	public BaseResponse logout(@PathVariable(value="token") String token){
		return userService.logout(token);
	}
	
	@RequestMapping(value="/infomation/{token}",method={RequestMethod.POST})
	public RegisterResponseVo changePersonalInfo(@PathVariable(value="token")String token,@RequestBody UserInfoRequest request){
		return userService.chagePersonalInfo(token,request);
	}

}
