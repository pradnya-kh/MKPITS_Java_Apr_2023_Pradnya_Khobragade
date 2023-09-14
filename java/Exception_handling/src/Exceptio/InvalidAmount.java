package Exceptio;

public class InvalidAmount extends Exception {
    public String getmessage(){
        return "Balance not less than 500";
    }
}
