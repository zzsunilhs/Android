package basics.Udemy

//34.List

enum class LootType {
    POTION, RING, ARMOR
}

class Loot(var name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return "$name is $type and is worth $value"
    }
}