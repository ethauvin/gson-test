package com.example.models

/**
 * The <code>FieldObject</code> class.
 *
 * @author <a href="mailto:erik@thauvin.net">Erik C. Thauvin</a>
 * @created 2016-08-11
 * @since 1.0
 */
class FieldObject {
    var hint: String = ""
    var alpha: Boolean = false
    var max: Int = 0

    override fun toString(): String {
        return "Field [hint=$hint, alpha=$alpha, max=$max]"
    }
}