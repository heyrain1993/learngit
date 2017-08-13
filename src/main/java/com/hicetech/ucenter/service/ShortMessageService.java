package com.hicetech.ucenter.service;

import com.hicetech.ucenter.model.response.BaseResponse;

public interface ShortMessageService {

	BaseResponse sendMSM(Integer type, String mobileNum);

}
