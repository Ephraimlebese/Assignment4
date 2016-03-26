package Assignment4.softwarePrinceples.plk.violation;

/**
 * Created by student on 2016/03/27.
 */
public class Wallet
{
    private int money;

    public int getMoney() {
        return money + 5;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int depositAmount)
    {
        money += depositAmount;
    }

    public void deductMoney(int amountWithdrawn)
    {
        money -= amountWithdrawn;
    }
}
