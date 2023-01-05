package task8;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
