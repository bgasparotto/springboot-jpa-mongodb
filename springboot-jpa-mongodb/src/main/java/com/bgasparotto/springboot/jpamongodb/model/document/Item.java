package com.bgasparotto.springboot.jpamongodb.model.document;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Bruno Gasparotto
 *
 */
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private BigDecimal price;

	/**
	 * Constructor.
	 *
	 */
	public Item() {
		this(null, null, null);
	}

	/**
	 * Constructor.
	 *
	 * @param id
	 *            The Item's {@code id}
	 * @param name
	 *            The Item's {@code name}
	 * @param price
	 *            The Item's {@code price}
	 */
	public Item(Long id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**
	 * Gets the Item's {@code id}.
	 *
	 * @return The Item's {@code id}
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the Item's {@code name}.
	 *
	 * @return The Item's {@code name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the Item's {@code price}.
	 *
	 * @return The Item's {@code price}
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Sets the Item's {@code id}.
	 *
	 * @param id
	 *            The Item's {@code id} to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the Item's {@code name}.
	 *
	 * @param name
	 *            The Item's {@code name} to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the Item's {@code price}.
	 *
	 * @param price
	 *            The Item's {@code price} to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}