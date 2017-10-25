package se.thinkcode.api;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MirrorTest {
    @Test
    public void mirror_should_be_able_to_reflect() {
        Mirror mirror = new Mirror();

        String actual = mirror.reflect("reflection");

        assertThat(actual).isEqualTo("reflection");
    }
}
