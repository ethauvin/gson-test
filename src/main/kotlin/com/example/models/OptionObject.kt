package com.example.models

/**
 * The <code>OptionObject</code> class.
 *
 * @author <a href="mailto:erik@thauvin.net">Erik C. Thauvin</a>
 * @created 2016-08-11
 * @since 1.0
 */
class OptionObject {
    var title: String = ""
    var fields: List<FieldObject> = emptyList()
    var dial: String = ""

    override fun toString(): String {
        return "Option [title=$title, fields=$fields, dial=$dial]"
    }
}