package factory;

public abstract class Factory {

    public final Product create(String owner, String no) {
        Product product = createProduct(owner, no);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner, String no);
    protected abstract void registerProduct(Product product);

}
