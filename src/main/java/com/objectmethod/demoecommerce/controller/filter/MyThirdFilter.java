package com.objectmethod.demoecommerce.controller.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Order(3) // Che significa? significa che questo filtro ha un ordine di esecuzione di 1.
			// quindi verrà eseguito per primo rispetto ad altri filtri che
			// potrebbero essere presenti nel progetto.
@Slf4j
public class MyThirdFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			log.info(headerName + ": " + headerValue);
		}
		log.info("fine filtri");
		chain.doFilter(request, response); // A cosa serve questa riga? permette di inviare la request e
											// response al prossimo filtro della catena

	}
}