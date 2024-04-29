package com.iesam.digitallibrary.user.newUser.domain;

import com.iesam.digitallibrary.user.domain.GetUserUseCase;
import com.iesam.digitallibrary.user.domain.GetUsersUseCase;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.newUser.data.Stun1UserDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GetUsersCaseTest {
    private GetUsersUseCase getUsersUseCase;

    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown() {
        getUsersUseCase = null;
    }


    @Test
    public void cuandoObtengoUnNuloEntoncesNoMuestroElCarnet() {
        // Given
        getUsersUseCase = new GetUsersUseCase(new Stun1UserDataRepository());

        // When

        ArrayList<User> getUser = getUsersUseCase.obtenerlistado();

        // Then
        Assertions.assertNull(getUser);
    }
}

