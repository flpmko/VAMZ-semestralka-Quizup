package sk.uniza.fri.simko.semestralka.model

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