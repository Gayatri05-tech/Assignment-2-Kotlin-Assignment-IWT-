data class User(
    val id: Int,
    val username: String,
    val isActive: Boolean
)

fun main() {
    val user = User(1, "Gayatri", true)
    val newUser = user.copy(isActive = false)

    println(user)
    println(newUser)
}
