package com.jxareas.jxelerate.annotations

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.annotation.AliasFor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Marks a class as a REST API controller, mapping HTTP requests to handler methods.
 * It provides a convenient way to define API controllers with mapping paths, request methods, request parameters, headers,
 * content types, and more.
 *
 * Usage:
 *
 * ```
 * @ApiController("/v1/countries", tagName = "Countries", tagDescription = "Endpoints for managing countries.")
 * class CountryController(service: CountryService, mapper: CountryDtoMapper) :
 *     AppController<CountryDto, Country, Int>(service, mapper) {
 *     // Controller implementation details
 * }
 * ```
 *
 * @param path The URL paths to which the controller should be mapped.
 *
 * @param tagName The name of the tag associated with the API controller.
 *
 * @param tagDescription The description of the tag associated with the API controller.
 *
 * @param values An array of URL paths to which the controller should be mapped.
 *
 * @param methods The array of HTTP methods supported by the API controller.
 *
 * @param params The array of request parameter conditions for the API controller.
 *
 * @param headers The array of request header conditions for the API controller.
 *
 * @param consumes The array of media types that the API controller can consume.
 *
 * @param produces The array of media types that the API controller can produce.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@RestController
@MustBeDocumented
@RequestMapping
@Tag(name = "")
annotation class ApiController(
    @get:AliasFor(annotation = RequestMapping::class, attribute = "path")
    vararg val path: String = [],
    @get:AliasFor(annotation = Tag::class, attribute = "name")
    val tagName: String = "",
    @get:AliasFor(annotation = Tag::class, attribute = "description")
    val tagDescription: String = "",
    @get:AliasFor(annotation = RequestMapping::class, attribute = "value")
    val values: Array<String> = [],
    @get:AliasFor(annotation = RequestMapping::class, attribute = "method")
    val methods: Array<RequestMethod> = [],
    @get:AliasFor(annotation = RequestMapping::class, attribute = "params")
    val params: Array<String> = [],
    @get:AliasFor(annotation = RequestMapping::class, attribute = "headers")
    val headers: Array<String> = [],
    @get:AliasFor(annotation = RequestMapping::class, attribute = "consumes")
    val consumes: Array<String> = [],
    @get:AliasFor(annotation = RequestMapping::class, attribute = "produces")
    val produces: Array<String> = [],
)
