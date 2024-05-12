package com.iesam.digitallibrary.digitalresources.data;

import com.iesam.digitallibrary.digitalresources.data.local.DigitalResourcesFileLocalDataSource;
import com.iesam.digitallibrary.digitalresources.data.local.DigitalResourcesLocalDataSource;
import com.iesam.digitallibrary.digitalresources.domain.DigitalResource;
import com.iesam.digitallibrary.digitalresources.domain.DigitalResourceRepository;
import com.iesam.digitallibrary.user.data.local.UserLocalDataSource;
import com.iesam.digitallibrary.user.domain.UserRepository;

import java.util.ArrayList;

public class DigitalResourceDataRepository implements DigitalResourceRepository {
    DigitalResourcesLocalDataSource digitalResourcesLocalDataSource;

    public DigitalResourceDataRepository(DigitalResourcesFileLocalDataSource digitalResourcesFileLocalDataSource) {
        this.digitalResourcesLocalDataSource = digitalResourcesFileLocalDataSource;
    }

    @Override
    public ArrayList<DigitalResource> list() {
        return digitalResourcesLocalDataSource.findAll();
    }
}
