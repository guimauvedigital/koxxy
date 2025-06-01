package digital.guimauve.koxxy.usecases

import digital.guimauve.koxxy.LocalProxyController

class StopLocalProxyUseCase : IStopLocalProxyUseCase {

    override fun invoke(input: Int) = LocalProxyController.stopProxy(input)

}
