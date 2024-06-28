package factory;

public class IDCardFactory extends Factory{


    @Override
    protected Product createProduct(String owner, String no) {
        return new IDCard(owner, no);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
