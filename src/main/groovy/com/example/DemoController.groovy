package com.example


import io.micronaut.http.annotation.Controller

@Controller('/demo')
class DemoController implements DemoEndpoints {
    @Override
    void doWithValidation(IntrospectedDto dto) {
        //noop
    }

    @Override
    void doWithoutValidation(NotIntrospectedDto dto) {
        //noop
    }
}
