package com.example.models

/**
 * The <code>Container</code> class.
 *
 * @author <a href="mailto:erik@thauvin.net" target="_blank">Erik C. Thauvin</a>
 * @created 2016-08-12
 * @since 1.0
 */
class Container {
    val nodes : List<Node> = emptyList()

    override fun toString(): String {
        return "Nodes [nodes=$nodes]"
    }
}