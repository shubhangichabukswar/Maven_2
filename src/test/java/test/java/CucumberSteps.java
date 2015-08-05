package test.java;

import main.java.Cal;
import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CucumberSteps extends TestCase{

	String exp;

@Given("^user enters \"([^\"]*)\"$")
public void user_enters(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
   // throw new PendingException();
	 exp = arg1;
}

@Then("^system shows \"([^\"]*)\"$")
public void system_shows(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
   // throw new PendingException();al

	Cal obj = new Cal();
	assertEquals(arg1,String.valueOf(obj.calculate(exp)));
}
	
}
