package builder;

public class Account {
    private long number;
    private String owner;
    private double ammount;
    private ACCOUNT_TYPE type;

    public Account(long number, String owner, double ammount, ACCOUNT_TYPE type) {
        this.number = number;
        this.owner = owner;
        this.ammount = ammount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", ammount=" + ammount +
                ", type=" + type +
                '}';
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public ACCOUNT_TYPE getType() {
        return type;
    }

    public void setType(ACCOUNT_TYPE type) {
        this.type = type;
    }
}
