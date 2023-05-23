package com.jxareas.jxcore.domain.helper

import jakarta.persistence.criteria.CriteriaBuilder
import jakarta.persistence.criteria.CriteriaQuery
import jakarta.persistence.criteria.Predicate
import jakarta.persistence.criteria.Root

object PredicateBuilder {

    fun <T> toPredicate(t: T?, root: Root<T?>?, query: CriteriaQuery<*>, cb: CriteriaBuilder): Predicate? {
        val predicates: List<Predicate> = ArrayList()
        return cb.and(*predicates.toTypedArray<Predicate>())
    }

}
