package com.stock.DowJonesIndex.message;

public class ResponseMessage {
	
	String respMsg;
	String respCode;
	
	public ResponseMessage(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg= respMsg;
		
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	
	

}
