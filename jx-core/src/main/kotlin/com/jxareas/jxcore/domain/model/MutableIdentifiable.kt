package com.jxareas.jxcore.domain.model

/**
 * A contract representing a uniquely, mutably identifiable entity.
 *
 * @param ID The type of the identifier.
 */
interface MutableIdentifiable<ID> {
    /**
     * The mutable identifier of the entity.
     */
    var id : ID
}
