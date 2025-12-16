package com.example.kanaev30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.kanaev30days.R

/**
 * A data class to represent the information presented in the hero card
 */
data class Hero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val hobbies: Int
)

val heroes = listOf(
    Hero(R.drawable.aquaman, R.string.hero_aqua, R.string.hero_descr_aqua),
    Hero(R.drawable.batman, R.string.hero_bat, R.string.hero_descr_bat),
    Hero(R.drawable.flash, R.string.hero_flash, R.string.hero_descr_flash),
    Hero(R.drawable.green, R.string.hero_green, R.string.hero_descr_green),
    Hero(R.drawable.john, R.string.hero_john, R.string.hero_descr_john),
    Hero(R.drawable.mars, R.string.hero_mars, R.string.hero_descr_mars),
    Hero(R.drawable.raven, R.string.hero_raven, R.string.hero_descr_raven),
    Hero(R.drawable.robin, R.string.hero_robin, R.string.hero_descr_robin),
    Hero(R.drawable.superman, R.string.hero_super, R.string.hero_descr_superman),
    Hero(R.drawable.wonder, R.string.hero_wonder, R.string.hero_descr_wonder),
    Hero(R.drawable.harly, R.string.harly, R.string.desc_harly),
    Hero(R.drawable.lex, R.string.lex, R.string.desc_lex),
    Hero(R.drawable.iron, R.string.iron, R.string.desc_iron),
    Hero(R.drawable.captain_america, R.string.cap, R.string.desc_cap),
    Hero(R.drawable.tor, R.string.tor, R.string.desc_tor),
    Hero(R.drawable.black_panther, R.string.panter, R.string.desc_panter),
    Hero(R.drawable.dc, R.string.tor, R.string.desc_tor),
    Hero(R.drawable.ros, R.string.ros, R.string.desc_ros),
    Hero(R.drawable.daredevil, R.string.sor, R.string.desc_sor),
    Hero(R.drawable.dead, R.string.dead, R.string.desc_dead),
    Hero(R.drawable.hulk, R.string.halk, R.string.desc_halk),
    Hero(R.drawable.cyborg, R.string.cyborg, R.string.desc_cyborg),
    Hero(R.drawable.shazam, R.string.shazam, R.string.desc_shazam),
    Hero(R.drawable.black_adam, R.string.adam, R.string.desc_adam),
    Hero(R.drawable.zatanna, R.string.zatanna, R.string.desc_zatanna),
    Hero(R.drawable.fayt, R.string.fayt, R.string.desc_fayt),
    Hero(R.drawable.gamora, R.string.gamora, R.string.desc_gamora),
    Hero(R.drawable.vision, R.string.vish, R.string.desc_vish),
    Hero(R.drawable.scarlett, R.string.scarlett, R.string.desc_scarlett),
    Hero(R.drawable.mistic, R.string.mistic, R.string.desc_mistic)
)