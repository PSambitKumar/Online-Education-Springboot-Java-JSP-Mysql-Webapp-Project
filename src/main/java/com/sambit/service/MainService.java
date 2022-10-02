package com.sambit.service;

import com.sambit.model.Register;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 4:01 PM
 */
public interface MainService {
	Register saveRegister(Register register);
	Register chekLogin(String email, String password);
}
