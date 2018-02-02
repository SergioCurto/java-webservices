package scurto.webservices.example;

import javax.jws.WebParam;
import javax.jws.WebService;

@SuppressWarnings("unused")
@WebService
public interface HelloWorldWebservice {

	/**
	 * Answers with hello message to the given name
	 */
	public String hello(String name);
	
	/**
	 * Sums the given values and returns the result
	 */
	public double sum(double value1, double value2);
}
