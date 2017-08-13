package com.hicetech.ucenter.service;

import com.hicetech.ucenter.model.request.UserInfoRequest;
import com.hicetech.ucenter.model.request.UserLoginRequest;
import com.hicetech.ucenter.model.request.UserRegisterRequest;
import com.hicetech.ucenter.model.response.BaseResponse;
import com.hicetech.ucenter.model.response.RegisterResponseVo;

public interface UserService {

	public RegisterResponseVo createUser(UserRegisterRequest register);

	public RegisterResponseVo loginUser(UserLoginRequest login);

	public BaseResponse changePassword(UserRegisterRequest register);

	public BaseResponse logout(String token);

	public RegisterResponseVo chagePersonalInfo(String token, UserInfoRequest request);
	
}
