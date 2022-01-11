package com.bridgelabz.day20.junit;

@FunctionalInterface
public interface UserRegistrationInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}