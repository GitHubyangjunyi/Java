
public class ExceptionSelfDefinedTestTwo {
    public static void main(String[] args) {
        BankCustomer Mack = new BankCustomer("Mack");
        Money m1 = new Money(500, "Mack");
        Mack.FetchMoney(m1,300);
        Mack.SaveMoney(m1,0);
        Mack.GetMoney(m1);
        try {
            m1.Save(300);
            m1.Fetch(500);
            System.out.println(m1.Get());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}

class NotEnoughException extends Exception {
    private static final long serialVersionUID = -1961369299450803718L;

    public NotEnoughException() {

    }

    public NotEnoughException(String str) {
        super(str);
    }
}

class Money {
    private String belong;
    private int money;

    public Money(int money, String belong) {
        this.money = money;
        this.belong = belong;
    }

    public void Save(int num) throws NotEnoughException {
        if (num <= 0) {
            throw new NotEnoughException("存款金额小于等于零!");
        }
        this.money += num;
    }

    public void Fetch(int num) throws NotEnoughException {
        if (this.money < num) {
            throw new NotEnoughException("余额小于取款金额!");
        }
        this.money -= num;
    }

    public int Get() {
        return this.money;
    }

    public String GetBelong() {
        return this.belong;
    }
}

class BankCustomer {
    private String name;

    public BankCustomer(String name) {
        this.name = name;
    }

    public void SaveMoney(Money money, int num) {
        try {
            money.Save(num);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void FetchMoney(Money money, int num) {
        try {
            money.Fetch(num);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void GetMoney(Money money) {
        System.out.println(name + ": " + money.Get());
    }
}