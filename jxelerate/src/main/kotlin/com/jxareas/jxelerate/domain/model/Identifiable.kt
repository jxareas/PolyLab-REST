package com.jxareas.jxelerate.domain.model

/**
 * A contract representing a uniquely, immutably identifiable entity.
 *
 * @author Jon Areas
 * @version 1.3
 * @param ID The type of the identifier.
 * @see MutableIdentifiable
 * @since 1.0
 */
interface Identifiable<ID> {
    /**
     * The immutable identifier of the entity.
     */
    val id: ID
}
