package com.iesam.digitallibrary.digitalresources.domain;

import java.util.ArrayList;

public class GetDigitalResourcesUseCase {

    public final DigitalResourceRepository digitalResourceRepository;


    public GetDigitalResourcesUseCase(DigitalResourceRepository digitalResourceRepository) {
        this.digitalResourceRepository = digitalResourceRepository;
    }
    private ArrayList<DigitalResource>  obtenerlistado(){
      return digitalResourceRepository.list();
    }

}
