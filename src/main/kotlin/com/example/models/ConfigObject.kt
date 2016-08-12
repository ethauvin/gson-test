package com.example.models

/**
 * The <code>ConfigObject</code> class.
 *
 * @author <a href="mailto:erik@thauvin.net">Erik C. Thauvin</a>
 * @created 2016-08-11
 * @since 1.0
 */
class ConfigObject {
    var name: String = ""
    var star: String = ""
    var hash: String = ""
    var master: Int = 0
    var opts: List<OptionObject> = emptyList()

    override fun toString(): String {
        return "Config [name=$name, star=$star, hash=$hash, master=$master, opts=$opts]"
    }
}