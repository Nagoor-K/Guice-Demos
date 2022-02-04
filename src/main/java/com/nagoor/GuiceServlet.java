package com.nagoor;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.nagoor.service.GuiceService;

@Singleton
public class GuiceServlet extends HttpServlet{

  private static final long serialVersionUID = 9018447634691332732L;
  @Inject
  private GuiceService guiceservice;
  
  
	@Override
	  protected void service(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	 
	
		response.getWriter().print(guiceservice.sayHello());
		
	  }
}
