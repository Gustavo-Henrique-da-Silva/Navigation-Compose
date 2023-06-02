package com.example.composenavigation

sealed class Destination(var route: String){
    object ScreenFirst: Destination("ScreenFirst")
    object ScreenSecond: Destination("ScreenSecond")
    object ScreenThird: Destination("ScreenThird")
    object ScreenFourth: Destination("ScreenFourth")
    object ScreenFive: Destination("ScreenFive")
}

