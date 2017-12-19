package com.bgasparotto.springboot.jpamongodb.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.bgasparotto.springboot.jpamongodb.model.document.Item;

/**
 * @author Bruno Gasparotto
 *
 */
@Document
public class Purchase {

	@Id
	private String id;

	private Date date;

	private List<Item> items;

	/**
	 * Constructor.
	 *
	 */
	public Purchase() {
		this(null, null, null);
	}

	/**
	 * Constructor.
	 *
	 * @param id
	 *            The Purchase's {@code id}
	 * @param date
	 *            The Purchase's {@code date}
	 * @param item
	 *            The Purchase's {@code items}
	 */
	public Purchase(String id, Date date, List<Item> items) {
		this.id = id;
		this.date = date;
		this.items = items;
	}

	/**
	 * Gets the Purchase's {@code id}.
	 *
	 * @return The Purchase's {@code id}
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the Purchase's {@code date}.
	 *
	 * @return The Purchase's {@code date}
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Gets the Purchase's {@code items}.
	 *
	 * @return The Purchase's {@code items}
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Sets the Purchase's {@code id}.
	 *
	 * @param id
	 *            The Purchase's {@code id} to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Sets the Purchase's {@code date}.
	 *
	 * @param date
	 *            The Purchase's {@code date} to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Sets the Purchase's {@code items}.
	 *
	 * @param item
	 *            The Purchase's {@code items} to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append(", date=");
		builder.append(date);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
}