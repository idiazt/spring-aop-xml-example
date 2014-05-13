package com.idiazt.springaopxmlexample.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.idiazt.springaopxmlexample.entities.Product;
import com.idiazt.springaopxmlexample.service.IService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-beans.xml")
public class TestAOPWithXMLConfiguration {

    @Autowired
    IService<Product> productService;
        
    @Test
    public void testProductService() throws Exception {
        Product product = productService.findById(1L);
        assertThat(product.getId(), is(1L));
    }

}
