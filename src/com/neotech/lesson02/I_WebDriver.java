package com.neotech.lesson02;

public interface I_WebDriver {
	// every property in interface is: public static final

	// every method in interface: public abstract

	public void get(String url);

	public void getTitle();

	public void getCurrentUrl();

	public void close();

	public void quit();
}
