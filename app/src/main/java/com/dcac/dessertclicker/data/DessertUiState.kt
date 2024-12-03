package com.dcac.dessertclicker.data

import androidx.annotation.DrawableRes
import com.dcac.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    val revenue: Int = 0,
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)