package com.iesam.digitallibrary.user.newUser.domain;

import com.iesam.digitallibrary.user.domain.GetUserUseCase;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.newUser.data.Stun1UserDataRepository;
import org.junit.jupiter.api.*;

import java.util.function.BooleanSupplier;

public class GetUserUseCaseTest {
    private GetUserUseCase getUserUseCase;

    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void tearDown() {
        getUserUseCase = null;
    }


    @Test
    public void cuandoObtengoUnNuloEntoncesNoMuestroElCarnet() {
        // Given
       getUserUseCase = new GetUserUseCase(new Stun1UserDataRepository());

        // When

        User getUser = getUserUseCase.execute("6");

        // Then
       Assertions.assertNull(getUser);
    }
}
