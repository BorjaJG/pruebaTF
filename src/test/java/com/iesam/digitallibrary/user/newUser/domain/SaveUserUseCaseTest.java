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
    public void cuandoObtengoUnValorNuloEntoncesNoMuestroElCarnet() {
        // Given
        User userNew = new User("null", "3", "email@example.com",
                "123456789", "123 Street Ave", "2024-04-15",
                "Regular", "Active", "No history", "No fines",
                "No transactions", "Email", "User",
                "Additional data") ;

        // When
        boolean result = stun1UserDataRepository.save(userNew);

        // Then
        Assertions.assertFalse(result);
        }

    }


