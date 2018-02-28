package com.micky.it.week7;


public class Contact {
    public int _id;
    public String _name;
    public String _phone_number;

    public Contact(){}

    public Contact(String name, String _phone_number)
    {
        this._name = name;
        this._phone_number = _phone_number;

    }
    public Contact(int id ,String name, String _phone_number)

    {    this._id = _id;
        this._name = name;
        this._phone_number = _phone_number;

    }
}
