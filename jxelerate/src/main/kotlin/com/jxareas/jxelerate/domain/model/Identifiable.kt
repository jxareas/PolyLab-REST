package com.jxareas.jxelerate.domain.model

/**
 * A contract representing a uniquely, immutably identifiable entity.
 *
 * @param ID The type of the identifier.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 */
interface Identifiable<ID> {
    /**
     * The immutable identifier of the entity.
     */
    val id: ID
}
