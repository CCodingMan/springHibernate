package com.ljj.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljj.dao.CategoryDAO;
import com.ljj.pojo.Category;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
//        List<Category> list = dao.find("from Category c");
//        System.out.println(list);
		
//		Category c = new Category();
//		c.setName("�ֻ�");
		
//		dao.save(c);
		
//		Category category = (Category) dao.get(Category.class, 1);
//		System.out.println(category.getName());
		
//		category.setName("�ֻ�2");
//		dao.update(category);
//		Category cate = dao.get(Category.class, 1);
//		System.out.println(cate.getName());
		
//		Category ca = dao.get(Category.class, 1);
//		dao.delete(ca);
		
//		for(int i = 0; i < 10; i++){
//			Category c = new Category();
//			c.setName("�ֻ�"+i);
//			dao.save(c);
//		}
		
		//��ҳ
//		DetachedCriteria dc = DetachedCriteria.forClass(Category.class);
//		int start = 2;//��0
//		int count = 5;
//		List<Category> list = dao.findByCriteria(dc, start, count);
//		for (Category category : list) {
//			System.out.println(category.getName());
//		}
		
		//������
//		List<Long> count = dao.find("select count(*) from Category c");
//		long total = count.get(0);
//		System.out.println(total);
		
		//
		
	}

}
