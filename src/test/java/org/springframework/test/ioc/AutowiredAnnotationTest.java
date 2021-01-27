package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author derekyi
 * @date 2020/12/27
 */
public class AutowiredAnnotationTest {

	@Test
	public void testAutowiredAnnotation() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:autowired-annotation.xml");
		PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = applicationContext.getBean(PropertyPlaceholderConfigurer.class);
		System.out.println(propertyPlaceholderConfigurer);

		Person person = applicationContext.getBean(Person.class);
		assertThat(person.getCar()).isNotNull();
	}
}
