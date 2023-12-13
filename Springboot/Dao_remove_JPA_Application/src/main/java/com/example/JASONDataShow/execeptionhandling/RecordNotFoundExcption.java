package com.example.JASONDataShow.execeptionhandling;

public class RecordNotFoundExcption extends RuntimeException{
    public RecordNotFoundExcption(String message){
        super(message);
    }
}
