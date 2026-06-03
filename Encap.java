class Bankacc {
    private String accnum;
    private double amt;

    public void setaccholder(String name) {
        this.accnum = name;
    }

    public void setamt(double amt) {
        this.amt = amt;
    }

    public String getaccnumholder() {
        return accnum;
    }

    public double getamt() {
        return amt;
    }
}

public class Encap {
    public static void main(String[] args) {
        Bankacc ba = new Bankacc();
        ba.setaccholder("prani");
        ba.setamt(1020210211);
        System.out.println("Account num : " + ba.getaccnumholder());
        System.out.println("Balance: " + ba.getamt());
    }
}