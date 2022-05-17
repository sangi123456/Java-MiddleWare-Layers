package com.training.core.unittesting.JunitCourse;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperParameterizedTest.class })
public class AllTests {

}
