package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		annotationConfigApplicationContext.getBean("appConfig");
//		IndexDao indexDaoImpl = (IndexDaoImpl) annotationConfigApplicationContext.getBean("appConfig");
//		indexDaoImpl.query();
	}
}
