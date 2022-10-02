package com.sambit.serviceImpl;

import com.sambit.model.Register;
import com.sambit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 9:00 PM
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private MainServiceImpl mainService;

	@Override
	public String checkLoginType(String email, String password) {
		Register register = mainService.chekLogin(email, password);
		if (register != null) {
			return register.getUserType();
		} else {
			return "INVALID";
		}
	}
}
