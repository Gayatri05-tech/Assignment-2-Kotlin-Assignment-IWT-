class Thermostat {
    var temperature: Double = 25.0
        private set

    fun changeTemperature(value: Double) {
        temperature = value
    }
}

fun main() {
    val thermostat = Thermostat()
    thermostat.changeTemperature(30.0)
    println(thermostat.temperature)
}
