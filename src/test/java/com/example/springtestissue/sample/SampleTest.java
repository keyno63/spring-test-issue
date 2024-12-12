package com.example.springtestissue.sample;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletResponse;


class SampleTest {

    @Test
    final void test1() {
        final MockHttpServletResponse mockResponse = new MockHttpServletResponse();
        assert true;
    }
}
