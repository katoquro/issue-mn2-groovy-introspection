package com.example

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post

import javax.validation.Valid

interface DemoEndpoints {
    @Post('/do-with-validation') void doWithValidation(@Body @Valid IntrospectedDto dto)

    @Post('/do-without-validation') void doWithoutValidation(@Body NotIntrospectedDto dto)
}