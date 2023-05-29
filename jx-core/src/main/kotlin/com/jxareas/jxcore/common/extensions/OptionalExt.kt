package com.jxareas.jxcore.common.extensions

import java.util.Optional

/**
 * Type alias for a function that supplies a Throwable.
 */
private typealias ExceptionSupplier = () -> Throwable

/**
 * Replaces the value if present or throws an exception.
 *
 * @param replaceValue The value to be returned if the Optional value is present.
 * @param exceptionSupplier A function that supplies the exception to be thrown if the Optional value is not present.
 * @return The replaced value.
 * @throws Throwable if the value of the Optional is not present.
 */
fun <T> Optional<T>.ifPresentOrElseThrow(replaceValue: T, exceptionSupplier: ExceptionSupplier): T =
    if (this.isPresent)
        replaceValue
    else throw exceptionSupplier.invoke()

/**
 * Replaces the value if present or throws the specified throwable.
 *
 * @param replaceValue The value to be returned if the Optional value is present.
 * @param throwable The throwable to be thrown if the Optional value is not present.
 * @return The replaced value.
 * @throws Throwable if the value of the Optional is not present.
 */
fun <T> Optional<T>.ifPresentOrThrow(replaceValue: T, throwable: Throwable): T =
    ifPresentOrElseThrow(replaceValue) {
        throwable
    }

/**
 * Returns the value if present, or throws the specified throwable.
 *
 * @param throwable The throwable to be thrown if the Optional value is not present.
 * @return The value if present.
 * @throws Throwable if the value of the Optional is not present.
 */
fun <T> Optional<T>.orElseThrow(throwable: Throwable): T =
    orElseThrow { throwable }
