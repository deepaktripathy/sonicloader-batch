package com.sonicloader.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonicloader.domain.*;
import com.sonicloader.rest.domain.StudentRegistration;
import com.sonicloader.rest.domain.StudentRegistrationReply;
/**
 * @author prate
 *
 */

@Controller
public class StudentRegisterController {
	@RequestMapping(method = RequestMethod.POST, value = "/register/student", produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public @ResponseBody StudentRegistrationReply registerStudent2(@RequestBody StudentRegistration studentregd) {
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		stdregreply.setName(studentregd.getName());
		stdregreply.setAge(studentregd.getAge());
		stdregreply.setRegistrationNumber("12345678");
		stdregreply.setRegistrationStatus("Successful");
		return stdregreply;
	}
}