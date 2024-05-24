package com.iesam.digitallibrary.digitalresources.domain;

public class DigitalResource {

    public final String  idDigitalResource;

    public DigitalResource(String idDigitalResource) {
        this.idDigitalResource = idDigitalResource;
    }


    @Override
    public String toString() {
        return "DigitalResource{" +
                "idDigitalResource='" + idDigitalResource + '\'' +
                '}';
    }
}
