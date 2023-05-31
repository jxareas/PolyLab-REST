package com.jxareas.jxelerator.domain.model

/**
 * A contract representing a uniquely, mutably identifiable entity.
 *
 * @author Jon Areas
 * @version 1.3
 * @param ID The type of the identifier.
 * @see Identifiable
 * @since 1.0
 */
interface MutableIdentifiable<ID> {
    /**
     * The mutable identifier of the entity.
     */
    var id : ID
}
