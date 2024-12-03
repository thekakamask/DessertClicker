# 🍰 Dessert Clicker App
**Dessert Clicker** is a fun and interactive application that lets users click on desserts to earn revenue, track the total desserts sold, and unlock new desserts as they progress. This project is built with Jetpack Compose and Material 3 to showcase modern Android development practices.

## 🚀 Features
   - **Click to Earn**: Tap on desserts to generate revenue and track your sales.
   - **Progression System**: Unlock more expensive desserts as you sell more.
   - **Revenue Tracking**: Display total revenue and desserts sold in real time.
   - **Share Progress**: Share your achievements with friends using the share button.
   - **Separation of Concerns**: Business logic is managed by the ViewModel, ensuring a simple and responsive user interface (UI).
   - **Modern Design**: Built with Jetpack Compose for a smooth, declarative UI experience.

## 🛠️ Tech Stack
   - **Kotlin**: For clean, modern, and concise code.
   - **Jetpack Compose**: For building a declarative and reactive UI.
   - **Material 3**: For a modern and consistent UI design.
   - **ViewModel**: State management and business logic separation.
   - **StateFlow**: Efficient and responsive state management.

## 📦 Project Structure
**Packages**:
1. **data**:
   - Contains the list of desserts and their properties.
   - Sets the UI state with the DessertUiState class.
2. **model**:
   - Data class representing a dessert
3. **ui**:
   - Contains the main implementation of the application with: 
      - **ViewModel**: Business logic and state management.
      - **DessertClickerApp**: Main screen that collects and displays application status.
      - **DessertClickerScreen**: Managing the display of sales and revenue details.
   - Provides components for the app bar and sharing.

## 🚀 How to Play
1. **Launch the App**: Start the Dessert Clicker game on your device or emulator.
2. **Click Desserts**: Tap on the dessert image to "sell" it and earn revenue.
3. **Track Your Progress**: Keep an eye on the total revenue and the number of desserts sold displayed on the screen.
4. **Unlock New Desserts**: As you sell more desserts, new and more valuable desserts will appear!
5. **Share Your Success**: Use the share button in the app bar to share your total revenue and desserts sold with friends.
6. **Enjoy**: Keep playing to see how far you can go!