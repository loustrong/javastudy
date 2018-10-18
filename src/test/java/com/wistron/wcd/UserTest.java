package com.wistron.wcd; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/** 
* User Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 12, 2018</pre> 
* @version 1.0 
*/ 
public class UserTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
//TODO: Test goes here...
    assertThat(new User().getName(),is("songhuiqiao"));
} 


} 
