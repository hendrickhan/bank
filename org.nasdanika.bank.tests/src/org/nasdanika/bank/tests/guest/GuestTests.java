package org.nasdanika.bank.tests.guest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;

@RunWith(NasdanikaWebTestSuite.class)
@SuiteClasses({
	NavigateToHomePageTests.class, 
	RegisterTests.class,
	LogInTests.class})
public class GuestTests {
	
}
