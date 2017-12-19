/**
 * 
 */
package com.bgasparotto.springboot.jpamongodb.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bgasparotto.springboot.jpamongodb.model.entity.Purchase;

/**
 * @author Bruno Gasparotto
 *
 */
public interface PurchaseRepository extends MongoRepository<Purchase, String> {

}