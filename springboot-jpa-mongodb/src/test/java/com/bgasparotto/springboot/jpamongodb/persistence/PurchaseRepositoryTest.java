package com.bgasparotto.springboot.jpamongodb.persistence;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bgasparotto.springboot.jpamongodb.model.document.Item;
import com.bgasparotto.springboot.jpamongodb.model.entity.Purchase;
import com.bgasparotto.springboot.jpamongodb.persistence.PurchaseRepository;

/**
 * @author Bruno Gasparotto
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseRepositoryTest {

	@Autowired
	private PurchaseRepository repository;

	@Test
	public void test() {
		Item first = new Item(4L, "New Veggie Burger", new BigDecimal(15));
		Item second = new Item(5L, "Other Veggie Burger", new BigDecimal(17));

		List<Item> items = new ArrayList<Item>();
		items.add(first);
		items.add(second);

		Purchase purchase = new Purchase(null, new Date(), items);

		purchase = repository.save(purchase);
		String id = purchase.getId();
		Assert.assertNotNull(id);
		
		System.out.println(purchase);
	}
}