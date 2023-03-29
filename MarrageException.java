package com.jsp.checked;

public class MarrageException extends Exception 

	 {
		private String msg;

		public MarrageException(String msg) {
			super();
			this.msg = msg;
		}
		@Override
		public String getMessage()
		{
			return msg;

	}

}
