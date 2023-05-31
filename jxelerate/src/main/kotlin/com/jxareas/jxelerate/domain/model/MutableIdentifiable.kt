package com.jxareas.jxelerate.domain.model

/**
 * A contract representing a uniquely, mutably identifiable entity.
 *
 * @param ID The type of the identifier.
 *
 * @author Jon Areas
 * @since 1.0
 * @version 1.3
 */
interface MutableIdentifiable<ID> {
    /**
     * The mutable identifier of the entity.
     */
    var id : ID
}
