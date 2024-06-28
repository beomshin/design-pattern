package factory;

public class IDCard extends Product{

    public String owner;
    public String no;

    IDCard(String owner, String no) {
        System.out.println(owner + "의 카드를 만듭니다.");
        System.out.println(owner + "의 일렬번호는 " + no + "입니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
