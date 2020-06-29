package com.jaenyeong.springapplicationcontext.ConverterAndFormatter;

public class Event {
	private Integer id;
	private String title;

	public Event(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "EventTwo{" +
				"id=" + id +
				", title='" + title + '\'' +
				'}';
	}
}
