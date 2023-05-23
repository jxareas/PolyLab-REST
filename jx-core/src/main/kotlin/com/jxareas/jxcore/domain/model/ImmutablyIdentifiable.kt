package com.jxareas.jxcore.domain.model

/**
 * A contract representing a uniquely and immutably identifiable entity.
 *
 * @param ID The type of the identifier.
 */
interface ImmutablyIdentifiable<ID> {
    /**
     * The identifier of the entity.
     */
    val identifier : ID
}
