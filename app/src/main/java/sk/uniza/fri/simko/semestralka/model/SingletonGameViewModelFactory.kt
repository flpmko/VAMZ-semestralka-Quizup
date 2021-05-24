package sk.uniza.fri.simko.semestralka.model

import androidx.lifecycle.ViewModelProvider.NewInstanceFactory


class SingletonNameViewModelFactory : NewInstanceFactory() {
    var t: GameViewModel? = null

    /*fun SingletonNameViewModelFactory() {
        //  t = provideNameViewModelSomeHowUsingDependencyInjection
    }

    override fun <T : GameViewModel?> create(modelClass: Class<GameViewModel>): T {
        return super.create(GameViewModel)
    }*/

}