package com.oblenergo.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

public class ErrorHandlerFilter implements Filter {

  private static final Logger LOGGER = Logger.getLogger(ErrorHandlerFilter.class);
  private final String pathToErrorJSP="/WEB-INF/views/error.jsp";

  @Override
  public void destroy() {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
          throws IOException, ServletException {


  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {
  }

}
