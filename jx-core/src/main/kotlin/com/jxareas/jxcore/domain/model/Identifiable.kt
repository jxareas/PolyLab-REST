package com.jxareas.jxcore.domain.model

/**
 * A contract representing a uniquely, immutably identifiable entity.
 *
 * @param ID The type of the identifier.
 */
interface Identifiable<ID> {
    /**
     * The immutable identifier of the entity.
     */
    val id: ID
}
