package peaksoft;

public class Building {

    private String address;
    private int money;

    public Building(String address, int money) {
        this.address = address;
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Адрес: " + address;
    }
}
