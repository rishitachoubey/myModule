package com.cg.onlinegrocery.exception;

public class OrderNotFoundExceptionResponse {
		
		private String orderNotFound;

		public OrderNotFoundExceptionResponse(String orderNotFound) {
			super();
			this.orderNotFound = orderNotFound;
		}

		public String getProjectNotFound() {
			return orderNotFound;
		}

		public void setProjectNotFound(String projectNotFound) {
			this.orderNotFound = projectNotFound;
		}
		
	}

