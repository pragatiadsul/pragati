package com.Expense.service;

//import static org.junit.Assert.*;
//import static org.mockito.Mockito.when;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.powermock.api.easymock.PowerMock;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 
 * @author Pragati
 *
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(CategoryServiceImpl.class)
public class CategoryServiceImpl1
{
//	
//	@InjectMocks
//	private CategoryServiceImpl categoryService;
// 
//
//	@Before
//	public void setUp() throws Exception
//	{
//		//categoryService=new CategoryServiceImpl(); 
//		MockitoAnnotations.initMocks(CategoryServiceImpl.class);
//		
//		
//	}
	
	

//	@Before
//	public void init() 
//	{
//		MockitoAnnotations.initMocks(CategoryServiceImpl.class);
//		
//	}
	
//	@Test
//	public void testGetMsg()
//	{
//		String msg="Hi";
//
//	    when(CategoryServiceImpl.get).thenReturn(msg);
//		//when(categoryService.getMessage()).thenReturn(msg);
//		assertEquals(msg, CategoryServiceImpl.getMessage());
//		
//	}

	@InjectMocks
	CategoryServiceImpl categoryService;
	
	@Before
	public void setUp() throws Exception {
		categoryService=new CategoryServiceImpl();
	MockitoAnnotations.initMocks(CategoryServiceImpl.class);
	}

	@Test
	public void testGetMessage() {
		String status="Mocked";
//		
//		when(CategoryServiceImpl.getStatus()).thenReturn(status);
//		
//		assertEquals(status, categoryService.getStatus());
//		when(CategoryServiceImpl.getStatus()).thenReturn(status);
		when(CategoryServiceImpl.getStatus()).thenReturn(status);
	
		assertEquals(status, categoryService.getStatus());
		
		
		
	}






}
