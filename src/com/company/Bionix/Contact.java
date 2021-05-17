package com.company.Bionix;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Contact implements Serializable, Comparator {
    public String name;
    public String surname;
    public String phoneNumber;
    public LocalDate birthDate;


    public Contact(String name, String surname, String phoneNumber, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName()) && Objects.equals(getSurname(), contact.getSurname()) && Objects.equals(getPhoneNumber(), contact.getPhoneNumber()) && Objects.equals(getBirthDate(), contact.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getPhoneNumber(), getBirthDate());
    }

    Comparator<Contact> comparatorBirthDate = new Comparator<Contact>() {
        @Override
        public int compare(Contact contact1, Contact contact2) {
            return contact1.birthDate.compareTo(contact2.birthDate);
        }
    };
}