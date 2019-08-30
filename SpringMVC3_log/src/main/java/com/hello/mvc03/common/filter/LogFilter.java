package com.hello.mvc03.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {
	
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		req.setCharacterEncoding("UTF-8");
		String remoteAddr = StringUtils.defaultString(req.getRemoteAddr()); // ip
		String uri = StringUtils.defaultString(req.getRequestURI());        // uri
		String url = StringUtils.defaultString(req.getRequestURL().toString()); // location(URL)
		String queryString = StringUtils.defaultString(req.getQueryString());   // QueryString
		String referer = StringUtils.defaultString(req.getHeader("referer"));   // 이전 페이지 주소
		String agent = StringUtils.defaultString(req.getHeader("User-Agent"));  // 브라우저 정보
		
		StringBuffer sb = new StringBuffer();
		sb.append("remoteAddr : " + remoteAddr).append("\n").append("uri : " + uri)
		.append("\n").append("url : " + url).append("\n").append("queryString : " + queryString)
		.append("\n").append("referer : " + referer).append("\n").append("agent : " + agent);
		
		logger.info("\n[LOG FILTER]\n" + sb);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {}
}
