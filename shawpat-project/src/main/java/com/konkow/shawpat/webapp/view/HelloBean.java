package com.konkow.shawpat.webapp.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloBean")
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name = "aloha";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}