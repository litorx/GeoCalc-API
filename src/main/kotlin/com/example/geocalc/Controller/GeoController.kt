package com.example.geocalc.controller

import com.example.geocalc.model.*
import com.example.geocalc.service.GeoService
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://127.0.0.1:5500"])
@RestController
@RequestMapping("/")
class GeoController(private val geoService: GeoService) {

    @GetMapping("/")
    fun home(): String {
        return "index"
    }

    @PostMapping("/circle/area")
    fun circleArea(@RequestBody circle: Circle): Double {
        return geoService.circleArea(circle.radius)
    }

    @PostMapping("/circle/perimeter")
    fun circlePerimeter(@RequestBody circle: Circle): Double {
        return geoService.circlePerimeter(circle.radius)
    }

    @PostMapping("/cone/volume")
    fun coneVolume(@RequestBody cone: Cone): Double {
        return geoService.coneVolume(cone.radius, cone.height)
    }

    @PostMapping("/hexagon/area")
    fun hexagonArea(@RequestBody hexagon: Hexagon): Double {
        return geoService.hexagonArea(hexagon.side)
    }

    @PostMapping("/hexagon/perimeter")
    fun hexagonPerimeter(@RequestBody hexagon: Hexagon): Double {
        return geoService.hexagonPerimeter(hexagon.side)
    }

    @PostMapping("/cube/volume")
    fun cubeVolume(@RequestBody cube: Cube): Double {
        return geoService.cubeVolume(cube.side)
    }

    @PostMapping("/cube/surface-area")
    fun cubeSurfaceArea(@RequestBody cube: Cube): Double {
        return geoService.cubeSurfaceArea(cube.side)
    }
}
