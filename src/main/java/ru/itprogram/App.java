package ru.itprogram;

import ru.itprogram.dto.UserDto;
import ru.itprogram.service.ServiceDto;
import ru.itprogram.utils.Sorter;
import ru.itprogram.utils.generator.UserDtoGenerator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        ServiceDto serviceDto = new ServiceDto();

        System.out.println("Получить одну сущность из БД:");
        System.out.println(serviceDto.getDto());

        System.out.println("Получить все сущности из БД:");
        for (UserDto userDto : serviceDto.getAllDto()) {
            System.out.println(userDto);
        }

        System.out.println("Передача одной сущности в БД:");
        serviceDto.addDtoObject(UserDtoGenerator.getUser());

        System.out.println("Передача всех сущностей в БД:");
        serviceDto.addListDtoObject(UserDtoGenerator.getListUser());

        List<UserDto> userDtos = new ArrayList<>(UserDtoGenerator.getListUser());
        Sorter.sortById(userDtos);
        Sorter.sortByBirthDate(userDtos);
        Sorter.sortByAddressStreet(userDtos);
    }
}
