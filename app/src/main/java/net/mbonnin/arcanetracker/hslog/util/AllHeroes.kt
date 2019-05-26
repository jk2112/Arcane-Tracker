package net.mbonnin.arcanetracker.hslog.util

import net.mbonnin.arcanetracker.helper.sanitizeIndex
import net.mbonnin.hsmodel.enum.PlayerClass

fun allHeroes(): Array<String> {
    return arrayOf(PlayerClass.WARRIOR, PlayerClass.SHAMAN, PlayerClass.ROGUE, PlayerClass.PALADIN, PlayerClass.HUNTER, PlayerClass.DRUID, PlayerClass.WARLOCK, PlayerClass.MAGE, PlayerClass.PRIEST, PlayerClass.NEUTRAL)
}

fun getPlayerClass(classIndex: Int): String {
    return allHeroes()[sanitizeIndex(classIndex)]
}

fun getClassIndex(playerClass: String): Int {
    return allHeroes().indexOf(playerClass)
}