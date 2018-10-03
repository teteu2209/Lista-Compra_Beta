package com.digitalmak;


import com.digitalmak.model.Product;
import com.digitalmak.model.ProductController;


public class App {
    public static void main(String[] args) {

      Product novo = new Product();

        novo.setName("Tenis");
        novo.setPrice(350.56);
        novo.setQty(2);

        ProductController teste = new ProductController();
        teste.create(novo);

    }
}
