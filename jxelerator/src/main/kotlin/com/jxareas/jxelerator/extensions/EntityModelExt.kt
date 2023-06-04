package com.jxareas.jxelerator.extensions

import com.jxareas.jxelerator.constants.WebLinkConstants
import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.Link
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder
import java.io.Serializable

/**
 * Adds a self-link to the EntityModel.
 *
 * @param controllerClass The class of the controller.
 * @param id The identifier of the entity.
 * @return The modified EntityModel with the self-link added.
 */
fun <T> EntityModel<T>.addSelfLink(controllerClass: Class<*>, id: Serializable): EntityModel<T> {
    val selfLink = MvcUriComponentsBuilder.fromController(controllerClass)
        .path("/{id}")
        .buildAndExpand(id)
        .toUri()
        .toString()

    this.add(Link.of(selfLink, WebLinkConstants.SELF))
    return this
}

/**
 * Adds a delete link to the EntityModel.
 *
 * @param controllerClass The class of the controller.
 * @param id The identifier of the entity.
 * @return The modified EntityModel with the delete link added.
 */
fun <T> EntityModel<T>.addDeleteLink(controllerClass: Class<*>, id: Serializable): EntityModel<T> {
    val deleteLink = MvcUriComponentsBuilder.fromController(controllerClass)
        .path("/{id}")
        .buildAndExpand(id)
        .toUri()
        .toString()

    this.add(Link.of(deleteLink, WebLinkConstants.DELETE))
    return this
}

/**
 * Adds an "all" link to the EntityModel.
 *
 * @param controllerClass The class of the controller.
 * @return The modified EntityModel with the "all" link added.
 */
fun <T> EntityModel<T>.addAllLink(controllerClass: Class<*>): EntityModel<T> {
    val allLink = MvcUriComponentsBuilder.fromController(controllerClass)
        .build()
        .toUri()
        .toString()

    this.add(Link.of(allLink, WebLinkConstants.ALL))
    return this
}

/**
 * Appends elementary links (self, delete, and all) to the EntityModel.
 *
 * @param controllerClass The class of the controller.
 * @param id The identifier of the entity.
 * @return The modified EntityModel with the elementary links added.
 */
fun <T> EntityModel<T>.appendElementaryLinks(controllerClass: Class<*>, id: Serializable): EntityModel<T> {
    addSelfLink(controllerClass, id)
    addAllLink(controllerClass)
    addDeleteLink(controllerClass, id)
    return this
}



