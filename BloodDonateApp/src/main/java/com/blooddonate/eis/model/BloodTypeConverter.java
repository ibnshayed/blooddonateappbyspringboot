package com.blooddonate.eis.model;

import javax.persistence.AttributeConverter;

public class BloodTypeConverter implements AttributeConverter<BloodType, String> {
    @Override
    public String convertToDatabaseColumn(BloodType attribute) {
        return attribute.toString();
    }
    @Override
    public BloodType convertToEntityAttribute(String bloodType) {
        return BloodType.of(bloodType).orElse(null);
    }

}