package com.example.geocalc.service

import org.springframework.stereotype.Service
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

@Service
class GeoService {

    fun circleArea(radius: Double): Double {
        return PI * radius.pow(2)
    }

    fun circlePerimeter(radius: Double): Double {
        return 2 * PI * radius
    }

    fun coneVolume(radius: Double, height: Double): Double {
        return (1.0 / 3.0) * PI * radius.pow(2) * height
    }

    fun hexagonArea(side: Double): Double {
        return (3 * sqrt(3.0) / 2) * side.pow(2)
    }

    fun hexagonPerimeter(side: Double): Double {
        return 6 * side
    }

    fun cubeVolume(side: Double): Double {
        return side.pow(3)
    }

    fun cubeSurfaceArea(side: Double): Double {
        return 6 * side.pow(2)
    }
}
