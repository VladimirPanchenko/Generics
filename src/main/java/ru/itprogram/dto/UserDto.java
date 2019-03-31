package ru.itprogram.dto;

import java.time.LocalDate;
import java.util.Objects;

public class UserDto {
    private long id;
    private String name;
    private Address address;
    private LocalDate birthDate;

    public static class Address {
        private String email;
        private CityType cityType;
        private String street;

        public Address(String email, CityType cityType, String street) {
            this.email = email;
            this.cityType = cityType;
            this.street = street;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public CityType getCityType() {
            return cityType;
        }

        public void setCityType(CityType cityType) {
            this.cityType = cityType;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return Objects.equals(email, address.email) &&
                    cityType == address.cityType &&
                    Objects.equals(street, address.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(email, cityType, street);
        }

        @Override
        public String toString() {
            return "Address{" +
                    "email='" + email + '\'' +
                    ", cityType=" + cityType +
                    ", street='" + street + '\'' +
                    '}';
        }
    }

    public UserDto(long id, String name, Address address, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id == userDto.id &&
                Objects.equals(name, userDto.name) &&
                Objects.equals(address, userDto.address) &&
                Objects.equals(birthDate, userDto.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, birthDate);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", birthDate=" + birthDate +
                '}';
    }
}