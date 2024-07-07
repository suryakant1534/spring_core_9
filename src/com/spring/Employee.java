package com.spring;

import java.util.List;

public class Employee {
    private Account account;
    private Car car;
    private List<String> books;

    public Account getAccount() {
        return account;
    }

    public Car getCar() {
        return car;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Employee(Account account, Car car, List<String> books) {
        this.account = account;
        this.car = car;
        this.books = books;
    }

    public Employee() {}

    @Override
    public String toString() {
        return "Employee [account=" + account + ", car=" + car + ", books=" + books + "]";
    }
}
