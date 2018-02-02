package scurto.webservices.example;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "scurto.webservices.example.HelloWorldWebservice",
        	serviceName = "HelloWorldWebservice")
public class HelloWorldWebserviceImpl implements HelloWorldWebservice {

	@Override
	public String hello(@WebParam(name="name") String name) {
		String result = "Hello "+name+"!";
		System.out.println("> hello("+name+") called, response: "+result);
		return result;
	}

	@Override
	public double sum(@WebParam(name="value1") double value1, @WebParam(name="value2") double value2) {
		double result = value1+value2;
		System.out.println("> sum("+value1+", "+value2+") called, response: "+result);
		return result;
	}
		
}
