

package com.Expense;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.Expense.model.Category;
import com.Expense.repository.CategoryRepository;
import com.Expense.service.ICategoryService;
@SpringBootTest
public class ExpenseTracker1ApplicationTests
{
	@Test
	void contextLoads() {
	}
}




//import junit.framework.Assert;

//@RunWith(SpringRunner.class)
//@SpringBootTest
/*public class CategoryServiceTest {
	@Autowired
	private ICategoryService categoryService;
	
	@MockBean
	private CategoryRepository categoryRepository;
	
@Test
public void testGetCategorySuccess()
{
	Category c1=new Category();
	c1.setCategoryId(1);
	c1.setCategory("phone");
	
	Category c2=new Category();
	c1.setCategoryId(1);
	c2.setCategory("Eletricity");
	
	Category c3=new Category();
	c1.setCategoryId(1);
	c3.setCategory("bags");
	
	Category c4=new Category();
	c1.setCategoryId(1);
	c4.setCategory("kshgkhs");
	
	List<Category> categoryList = new ArrayList<>();
	categoryList.add(c1);
	categoryList.add(c2);
	categoryList.add(c3);
	categoryList.add(c4);
	
	
Mockito.when(categoryRepository.findAll()).thenReturn(categoryList);
	assertThat(categoryService.getAllCategories()).isEqualTo(categoryList);
//	
	//assertEquals(categoryService.getAllCategories(), categoryList);

	//assertEquals(categoryList,categoryService.getAllCategories());
	System.out.println("test case executed successfully");

	
}


//@Test
//public void TestgetCategories()
//{
//	Category category=new Category();
//	category.setCategoryId(1);
//	category.setCategory("phone");
//
//	Assert.assertEquals(category.getCategory(), "phone");
//	
//}
	
	
//
//	@Test
//	public void test() {
//		//fail("Not yet implemented");
//		System.out.println("test case executed successfully");
//	}

}*/
