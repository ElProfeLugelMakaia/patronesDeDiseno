package builder;

public class AccountBuilder implements IBuilder <Account>{
    private long number;
    private String owner;
    private double ammount;
    private ACCOUNT_TYPE type;

    public AccountBuilder withNumber(long number){
        if(this.type == null){
            throw new RuntimeException("You must define the type first");
        }
        if(this.type == ACCOUNT_TYPE.AHORROS){
            this.number = Long.parseLong("5" + number);
        } else {
            this.number = Long.parseLong("4" + number);
        }
        return this;
    }

    public AccountBuilder withOwner(String owner){
        if(this.type == null){
            throw new RuntimeException("You must define the type first");
        }
        this.owner = owner;
        return this;
    }

    public AccountBuilder withAmmount(double ammount){
        if(this.type == null){
            throw new RuntimeException("You must define the type first");
        }
        if(ammount < 0){
            throw new RuntimeException("The initial Ammout must be greatter than 0");
        }
        this.ammount = ammount;
        return this;
    }

    public AccountBuilder withType(ACCOUNT_TYPE type){
        this.type  = type;
        return this;
    }

    public AccountBuilder withDefaults(String owner){
        this.ammount = 0D;
        this.owner = owner;
        this.type = ACCOUNT_TYPE.AHORROS;
        return this.withNumber(31252341234L);
    }

    @Override
    public Account build() {
        return new Account(this.number, this.owner, this.ammount, this.type);
    }
}
