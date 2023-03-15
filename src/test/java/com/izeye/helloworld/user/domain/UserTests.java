package com.izeye.helloworld.user.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link User}.
 *
 * @author Johnny Lim
 */
class UserTests {

    @Test
    void test() {
        String name = "Johnny";
        String favoriteColor = "red";
        int favoriteNumber = 1;

        User user = User.newBuilder()
                .setName(name)
                .setFavoriteColor(favoriteColor)
                .setFavoriteNumber(favoriteNumber)
                .build();

        assertThat(user.getName()).isEqualTo(name);
        assertThat(user.getFavoriteColor()).isEqualTo(favoriteColor);
        assertThat(user.getFavoriteNumber()).isEqualTo(favoriteNumber);
    }

}
