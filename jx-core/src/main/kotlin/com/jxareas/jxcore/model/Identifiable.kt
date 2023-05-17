package com.jxareas.jxcore.model

import com.fasterxml.jackson.annotation.JsonGetter

interface Identifiable<ID> {
    var id : ID
}
