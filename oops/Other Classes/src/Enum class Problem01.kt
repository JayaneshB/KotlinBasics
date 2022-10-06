fun main() {

    var currentState=Game.STARTED
    for (i in 1..20){
        println(currentState)
        currentState=changeState(currentState)
    }
}

fun changeState(currentState:Game):Game {
    return when (currentState){
        Game.STARTED -> Game.PLAYING
        Game.PLAYING -> Game.GAMEOVER
        Game.GAMEOVER -> Game.PLAYING
    }
}
enum class Game {
    STARTED,
    PLAYING,
    GAMEOVER
}
