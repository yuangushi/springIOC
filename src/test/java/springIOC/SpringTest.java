package springIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuan.demo.UserBean;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		UserBean user=context.getBean(UserBean.class);
		UserBean user1=(UserBean) context.getBean("user");
		System.out.println(user==user1);
		
	}

}
