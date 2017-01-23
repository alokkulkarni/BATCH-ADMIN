package com.alok.batchAdmin;

import org.springframework.batch.admin.annotation.EnableBatchAdmin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableBatchProcessing
@EnableBatchAdmin
@SpringBootApplication
//@ImportResource({"classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml", "classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml"})
public class BatchAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchAdminApplication.class, args);
	}
}




