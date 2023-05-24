package com.jxareas.jxcore.domain.model

/**
 * A contract representing a mutable and uniquely identifiable entity.
 *
 * @param ID The type of the identifier.
 */
interface MutableIdentifiable<ID> {
    /**
     * The identifier of the entity.
     */
    var identifier : ID
}
