package sixthprogram;

class DemonetizationException extends Exception{
    float amount;
    DemonetizationException(float amount)
    {
        this.amount=amount;
    }
    public String toString()
    {
        return "Deposit of Old Currency of (Rs."+amount+")crosses Rs.5000 and cannot be deposited";
    }
}