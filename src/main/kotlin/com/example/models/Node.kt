package com.example.models

/**
 * The <code>Node</code> class.
 *
 * @author <a href="mailto:erik@thauvin.net" target="_blank">Erik C. Thauvin</a>
 * @created 2016-08-12
 * @since 1.0
 */
class Node {
    var item1: String = ""
    var item2: String = ""

    override fun toString() : String {
        return "Node [item1=$item1, item2=$item2]"
    }
}