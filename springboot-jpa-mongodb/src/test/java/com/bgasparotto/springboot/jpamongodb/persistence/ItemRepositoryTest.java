package com.bgasparotto.springboot.jpamongodb.persistence;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bgasparotto.springboot.jpamongodb.model.document.Item;
import com.bgasparotto.springboot.jpamongodb.persistence.ItemRepository;


/**
 * @author Bruno Gasparotto
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repository;

	@Test
	public void shouldListAll() {
		List<Item> list = repository.findAll();
		Assert.assertFalse(list.isEmpty());
	}

	@Test
	public void shouldSaveAndDelete() {
		Item item = new Item(null, "New Veggie Burger", new BigDecimal(15));
		item = repository.save(item);
		Long id = item.getId();
		Assert.assertTrue(id != null);
		
		repository.delete(id);
		Assert.assertNull(repository.findOne(id));
	}
}