package Banking7;

public class OverdraftException extends Exception{
    private double deficit;//表示所取的钱与余额的差额

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String message, double deficit){
        super(message);
        this.deficit = deficit;
    }
}
