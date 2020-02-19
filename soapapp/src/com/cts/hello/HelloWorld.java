package com.cts.hello;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.cts.modal.Person;
;
 
//Service Endpoint Interface
@WebService
@SOAPBinding
public interface HelloWorld{
 
	@WebMethod List<Person> getAllPersons();

}
