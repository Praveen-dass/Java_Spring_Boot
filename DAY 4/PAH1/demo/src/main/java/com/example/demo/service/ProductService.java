package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo)
    {
        this.productRepo=productRepo;
    }

    public boolean safe(Product product)
    {
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            System.out.println("Exception:");
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    // public List<Product> getallproduct()
    // {
    //     return productRepo.findAll();
    // }
    
    public Product get_id(int id)
    {
        Optional<Product>k = productRepo.findById(id);
        return k.orElse(null);
    }

    public boolean updateall(int id,Product product)
    {
        if(this.get_id(id) ==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            System.out.println("Exception:");
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean deleteAll(int id)
    {
        if(this.get_id(id) ==null)
        {
            return false;
        }
        try{
            productRepo.deleteById(id);
        }
        catch(Exception e)
        {
            System.out.println("Exception:");
            System.out.println(e);
            return false;
        }
        return true;
    }

}
