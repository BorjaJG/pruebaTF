package com.iesam.digitallibrary.user.newUser.domain;

import com.iesam.digitallibrary.user.domain.NewUserUseCase;
import com.iesam.digitallibrary.user.domain.User;
import com.iesam.digitallibrary.user.newUser.data.Stun1UserDataRepository;
import org.junit.jupiter.api.*;

class SaveUserUseCaseTest {
    private Stun1UserDataRepository stun1UserDataRepository;

    @BeforeEach
    void setUp() {
        stun1UserDataRepository = new Stun1UserDataRepository();
    }

    @AfterEach
    void tearDown() {
        stun1UserDataRepository = null;
    }

    @Test
    public void cuandoObtengoUnNuloEntoncesNoMuestroElCarnet() {
        // Given
        User userNew = null;

        // When
        boolean result = stun1UserDataRepository.save(userNew);

        // Then
        Assertions.assertFalse(result);
    }
    @Test
    public void cuandoCadaCampoEsNuloEntoncesNoMuestroElCarnet2() {
        // Given
        User userNew = new User(null, null, null, null, null,
                null, null, null, null, null,
                null, null, null, null);

        // When
        boolean result = stun1UserDataRepository.save(userNew);

        // Then
        Assertions.assertFalse(result);
    }


}


