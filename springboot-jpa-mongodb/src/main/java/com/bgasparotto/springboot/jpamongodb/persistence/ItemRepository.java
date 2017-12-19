/**
 * 
 */
package com.bgasparotto.springboot.jpamongodb.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bgasparotto.springboot.jpamongodb.model.document.Item;

/**
 * @author Bruno Gasparotto
 *
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

}