package com.dcac.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.dcac.dessertclicker.data.Datasource.dessertList
import com.dcac.dessertclicker.data.DessertUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DessertClickerViewModel : ViewModel() {
     private val _uiState = MutableStateFlow(DessertUiState())
     val uiState: StateFlow<DessertUiState> = _uiState.asStateFlow()

     fun updateDessertDatas() {
          _uiState.update { currentState ->
               val dessertsSold = currentState.dessertsSold + 1
               val nextDessertIndex = determineDessertToShow(dessertsSold)
               currentState.copy(
                    currentDessertIndex = nextDessertIndex,
                    revenue = currentState.revenue + currentState.currentDessertPrice,
                    dessertsSold = dessertsSold,
                    currentDessertImageId = dessertList[nextDessertIndex].imageId,
                    currentDessertPrice = dessertList[nextDessertIndex].price
               )

          }
     }

     private fun determineDessertToShow(dessertsSold : Int) : Int {
          var dessertIndex = 0
          for (index in dessertList.indices) {
               if (dessertsSold >= dessertList[index].startProductionAmount) {
                    dessertIndex = index
               } else {
                    // The list of desserts is sorted by startProductionAmount. As you sell more
                    // desserts, you'll start producing more expensive desserts as determined by
                    // startProductionAmount. We know to break as soon as we see a dessert who's
                    // "startProductionAmount" is greater than the amount sold.
                    break
               }
          }
          return dessertIndex

     }


}