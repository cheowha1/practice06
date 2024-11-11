package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;        // private -> protected 로 변경
	protected String lineColor;        // 바꾼 이유 private = 같은 클래스 내에서만 접근가능며 외부에서는 접근할수가 없고
	private int width;                 // protected = 같은 클래스나 이를 상속받은 자식 클래스에서만 접근할수 있어서 protected로 변경하였음
	private int height;
	
	public Shape(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}

