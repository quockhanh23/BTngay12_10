public class Product {
    int code;
    double price;
    String name;
    String type;
    String unitMoney;

    public Product(int code, double price, String name, String type) {
        this.code = code;
        this.price = price;
        this.name = name;
        this.type = type;
        this.unitMoney = "USD";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnitMoney() {
        return unitMoney;
    }

    public void setUnitMoney(String unitMoney) {
        this.unitMoney = unitMoney;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", unitMoney='" + unitMoney + '\'' +
                '}';
    }
}
