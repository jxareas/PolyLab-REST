package com.jxareas.jxcore.domain.model

/**
 * A contract representing a uniquely identifiable entity.
 *
 * @param ID The type of the identifier.
 */
interface Identifiable<ID> {
    /**
     * The identifier of the entity.
     */
    var identifier : ID
}
