package de.lehrbaum.abapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform