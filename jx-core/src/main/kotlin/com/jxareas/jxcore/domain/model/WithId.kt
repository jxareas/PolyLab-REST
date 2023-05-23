package com.jxareas.jxcore.domain.model

interface WithId<ID> {
    /**
     * The identifier of the entity.
     */
    val identifier : ID
}
