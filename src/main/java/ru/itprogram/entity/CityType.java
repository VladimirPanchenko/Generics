package ru.itprogram.entity;

public enum CityType {
    MOSCOW("Москва") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.MOSCOW;
        }
    }, ST_PETERSBURG("Санкт-Петербург") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.ST_PETERSBURG;
        }
    }, NOVOSIBIRSK("Новосибирск") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.NOVOSIBIRSK;
        }
    },
    YEKATERINBURG("Екатеринбург") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.YEKATERINBURG;
        }
    }, NIZHNY_NOVGOROD("Нижний Новгород") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.NIZHNY_NOVGOROD;
        }
    }, KAZAN("Казань") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.KAZAN;
        }
    },
    CHELYABINSK("Челябинск") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.CHELYABINSK;
        }
    }, OMSK("Омск") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.OMSK;
        }
    }, SAMARA("Самара") {
        @Override
        public ru.itprogram.dto.CityType asCityType() {
            return ru.itprogram.dto.CityType.SAMARA;
        }
    }, ROSTOV_ON_DON("Ростов-на-Дону");

    private String rusName;

    CityType(String rusName) {
        this.rusName = rusName;
    }

    public ru.itprogram.dto.CityType asCityType() {
        return ru.itprogram.dto.CityType.ROSTOV_ON_DON;
    }

    @Override
    public String toString() {
        return "CityType{" +
                "rusName='" + rusName + '\'' +
                '}';
    }
}