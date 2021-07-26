/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import model.services.ProductService;



/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
       
        ProductService ps = new ProductService();
        
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println("Sum = "+ String.format("%.2f", sum));
 
    
}
}

