package net.smktarunabhakti.penjualan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
   private static ApplicationContext appCtx;
   
   public static void main(String[] args) {
	   appCtx = new ClassPathXmlApplicationContext(
			   "classpath:net/smktarunabhakti/penjualan/" 
					   + "applicationContex.xml");
   }
}
