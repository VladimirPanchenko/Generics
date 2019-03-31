package ru.itprogram.dto;

public enum CityType {
    MOSCOW("Москва") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.MOSCOW;
        }
    }, ST_PETERSBURG("Санкт-Петербург") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.ST_PETERSBURG;
        }
    }, NOVOSIBIRSK("Новосибирск") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.NOVOSIBIRSK;
        }
    },
    YEKATERINBURG("Екатеринбург") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.YEKATERINBURG;
        }
    }, NIZHNY_NOVGOROD("Нижний Новгород") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.NIZHNY_NOVGOROD;
        }
    }, KAZAN("Казань") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.KAZAN;
        }
    },
    CHELYABINSK("Челябинск") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.CHELYABINSK;
        }
    }, OMSK("Омск") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.OMSK;
        }
    }, SAMARA("Самара") {
        @Override
        public ru.itprogram.entity.CityType asCityType() {
            return ru.itprogram.entity.CityType.SAMARA;
        }
    }, ROSTOV_ON_DON("Ростов-на-Дону");

    private String rusName;

    CityType(String rusName) {
        this.rusName = rusName;
    }

    public ru.itprogram.entity.CityType asCityType() {
        return ru.itprogram.entity.CityType.ROSTOV_ON_DON;
    }

    @Override
    public String toString() {
        return "CityType{" +
                "rusName='" + rusName + '\'' +
                '}';
    }
}