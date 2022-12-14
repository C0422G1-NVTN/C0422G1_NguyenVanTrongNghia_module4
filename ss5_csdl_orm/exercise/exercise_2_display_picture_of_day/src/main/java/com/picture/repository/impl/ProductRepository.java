package com.picture.repository.impl;

import com.picture.model.Product;
import com.picture.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {


    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                "select p from Product p", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void addNewProduct(Product product) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.persist(product);
        transaction.commit();
    }

    @Override
    public Product getProductById(int productId) {
        return BaseRepository.entityManager.find(Product.class, productId);
    }

    @Override
    public void updateProduct(Product product) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.merge(product);
        transaction.commit();
    }

    @Override
    public void deleteProduct(int productId) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.remove(getProductById(productId));
        transaction.commit();
    }
}
