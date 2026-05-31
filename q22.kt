sealed class ScreenState {
    object Loading : ScreenState()
    object Success : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}
fun renderUI(state: ScreenState) {
    when (state) {
        is ScreenState.Loading -> println("Loading...")
        is ScreenState.Success -> println("Success!")
        is ScreenState.Error -> println("Error: ${state.errorMsg}")
    }
}
fun main() {
    renderUI(ScreenState.Loading)
    renderUI(ScreenState.Success)
    renderUI(ScreenState.Error("Network Error"))
}
