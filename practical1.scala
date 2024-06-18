def areaofDisk(radius: Double): Double = {
    val pi = 22.0 / 7.0
    pi * radius * radius
}

def celcToFahrenheit(celcius: Double): Double = {
    (celcius * 1.80) + 32.00
}

def volumeOfSphere(radius: Double): Double = {
    val pi = 22.0 / 7.0
    (4.0 / 3.0) * pi * radius * radius * radius
}

def totalBookCost(copies: Int): Double = {
    val discountPrice=24.95 * (60.0 / 100.0)
    val totalShipCost = if (copies <= 50){
        3.0 * copies
    }else{
        (3.0 * 50.0) + (3.75 * (copies - 50.0))
    }
    (discountPrice * copies) + totalShipCost
    
}

def totalrunTime(): Int = {
    val easyPace = (2 * 8)
    val tempoPace = (3 * 7)
    (easyPace * 2) + tempoPace
}
