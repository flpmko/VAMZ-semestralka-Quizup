package sk.uniza.fri.simko.semestralka.model

/**
 * Grid item
 *
 * Predtsavuje jeden item (prvok) v grid view.
 * Pouziva sa v Menu.
 *
 * @constructor Create empty Grid item
 */
class gridItem {
    var icon: Int? = 0
    var name: String? = null
    var id: Int? = 0

    constructor(icon: Int?, name: String?, id: Int?) {
        this.icon = icon
        this.name = name
        this.id = id
    }
}