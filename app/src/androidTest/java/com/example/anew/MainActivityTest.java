package com.example.anew;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest<ActivityTestRule> {

    @Rule
    public ActivityTestRule mainActivityActivityTestRule = new "ActivityTestRule"(MainActivity.class);
    private MainActivity mActivity=null;

    @Before
    public void setUp() throws Exception {
        mActivity=mainActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch()
    {

    }

    @After
    public void tearDown() throws Exception {
    }
}