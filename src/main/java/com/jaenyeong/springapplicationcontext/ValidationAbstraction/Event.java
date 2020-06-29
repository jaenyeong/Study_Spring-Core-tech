package com.jaenyeong.springapplicationcontext.ValidationAbstraction;

import javax.validation.constraints.*;

public class Event {
	Integer id;

	@NotEmpty
	String title;

	@NotNull @Min(0)
	Integer limit;

	@Email
	String email;

	public Integer getId() {
		return id;
	}

	public Event setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public Event setTitle(String title) {
		this.title = title;
		return this;
	}

	public Integer getLimit() {
		return limit;
	}

	public Event setLimit(Integer limit) {
		this.limit = limit;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Event setEmail(String email) {
		this.email = email;
		return this;
	}
}
