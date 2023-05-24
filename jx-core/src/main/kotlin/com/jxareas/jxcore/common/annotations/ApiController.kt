package com.jxareas.jxcore.common.annotations

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.annotation.AliasFor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Annotation to mark a class as a `JxCore` Controller.
 * This annotation is used to simplify the creation of API controllers.
 *
 * @param path The paths to map to the controller.
 * @param tagName The name of the tag for API documentation (Alias for @Tag name).
 * @param tagDescription The description of the tag for API documentation (Alias for @Tag description).
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@RestController
@MustBeDocumented
@RequestMapping
@Tag(name = "")
annotation class ApiController(
    val path: Array<String> = [],
    @get:AliasFor(annotation = Tag::class, attribute = "name")
    val tagName: String = "",
    @get:AliasFor(annotation = Tag::class, attribute = "description")
    val tagDescription: String = "",
)
