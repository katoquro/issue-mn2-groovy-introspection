package com.example

import io.micronaut.core.annotation.Introspected

import javax.validation.constraints.NotNull

@Introspected
class IntrospectedDto {
    @NotNull Map<String, Set<String>> mapStructure
}
