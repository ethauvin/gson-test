package com.example

import com.example.models.ConfigObject
import com.example.models.Container
import com.google.gson.Gson

fun main(args: Array<String>) {
    var json = "{ nodes: [ { item1: 'value1a', item2: 'value2a' }, { item1: 'value1b', item2: 'value2b' }, { item1: 'value1c', item2: 'value2c' } ] } "

    val gson = Gson()
    val container: Container = gson.fromJson(json, Container::class.java)
    println(container)

    json = "{ \"name\": \"DKS 1802-EPD\", \"star\": \"*\", \"hash\": \"#\", \"master\": 4, \"opts\": [ { \"title\": \"Delete 4-Digit Entry Code\", \"fields\": [ { \"hint\": \"Entry Code\", \"alpha\": false, \"max\": 4 } ], \"dial\": \"*14[MASTER],[FIELD:1]*\" }, { \"title\": \"Add 4-Digit Entry Code\", \"fields\": [ { \"hint\": \"Entry Code\", \"alpha\": false, \"max\": 4 } ], \"dial\": \"*02[MASTER],[FIELD:1]*\" }, { \"title\": \"Add Name\", \"fields\": [ { \"hint\": \"Directory Code\", \"alpha\": false, \"max\": 3 }, { \"hint\": \"Name\", \"alpha\": true, \"max\": 11 } ], \"dial\": \"*66[MASTER],[FIELD:1]*,[FIELD:2]*\" }, { \"title\": \"Add 7-digit Phone Number\", \"fields\": [ { \"hint\": \"Directory Code\", \"alpha\": false, \"max\": 3 }, { \"hint\": \"Phone Number\", \"alpha\": true, \"max\": 7 } ], \"dial\": \"*01[MASTER],[FIELD:1]*,[FIELD:2]*\" }, { \"title\": \"Set Time Clock\", \"fields\": [ { \"hint\": \"Hour & Minutes\", \"alpha\": false, \"max\": 4 }, { \"hint\": \"AM=0 PM=1\", \"alpha\": false, \"max\": 1 }, { \"hint\": \"Month\", \"alpha\": false, \"max\": 2 }, { \"hint\": \"Day of Month\", \"alpha\": false, \"max\": 2 }, { \"hint\": \"Year\", \"alpha\": false, \"max\": 2 }, { \"hint\": \"Day of Week (Sun=1, Mon=2..)\", \"alpha\": false, \"max\": 1 } ], \"dial\": \"*33[MASTER],[FIELD:1]*,[FIELD:2]*,[FIELD:3]*,[FIELD:4]*,[FIELD:5]*,[FILED:6]*\" } ] }"
    val config : ConfigObject = gson.fromJson(json, ConfigObject::class.java)
    println(config)
}